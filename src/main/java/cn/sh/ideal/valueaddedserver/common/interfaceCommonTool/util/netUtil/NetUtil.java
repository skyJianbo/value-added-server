package cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.netUtil;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.lang3.StringUtils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 *  NetUtil 
 *  @author  振鹏  
 *  @ClassName  : NetUtil*  
 *  @Version  版本 *  
 *  @ModifiedBy 修改人 * 
 *  @Copyright  公司名称 * 
 *  @date  2018年8月23日 上午10:07:53
 */
@Slf4j
public class NetUtil {



	/**
	 * 
	 * postJson: (post 请求 json格式). <br/>
	 * @author 振鹏
	 * @param url
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public static String postJson(String url, String param) throws Exception {
		HttpClient httpClient = new HttpClient();
		PostMethod postMethod = new PostMethod(url);
		String soapRequestData = "";// 执行后的返回结果
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		InputStream is = null;
		try {

			byte[] b = param.getBytes("utf-8");
			// 记录请求参数报文;判断是因为在oracle的版本中;字段为CLOB；如果长度在1000-2000之间；会出现异常；手动补齐
			if (param.length() >= 1000 && param.length() <= 2000) {
				param = StringUtils.rightPad(param, 2008);
			}

			is = new ByteArrayInputStream(b, 0, b.length);
			RequestEntity re = new InputStreamRequestEntity(is, b.length, "application/json; charset=utf-8");
			postMethod.setRequestEntity(re);
			postMethod.addRequestHeader("Connection", "close");
			httpClient.getParams().setBooleanParameter("http.protocol.expect-continue", false);
			//判断请求接口是否为optPackagePromotionCompletion 异步改性能接口
			if(url.contains("optPackagePromotionCompletion")) {
				//接口超时为60秒
				httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(10000 * 6);
				httpClient.getHttpConnectionManager().getParams().setSoTimeout(10000 * 6);
			}else {
				httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(1000 * 3);
				httpClient.getHttpConnectionManager().getParams().setSoTimeout(1000 * 10);
			}
			int statusCode = httpClient.executeMethod(postMethod);
			if (statusCode != 200) {

			} else {

			}

			soapRequestData = postMethod.getResponseBodyAsString();
			// 获取返回结果数据流
			inputStream = postMethod.getResponseBodyAsStream();
			inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
			bufferedReader = new BufferedReader(inputStreamReader);
			String lines;
			StringBuffer sb = new StringBuffer();
			while ((lines = bufferedReader.readLine()) != null) {
				sb.append(lines);
			}
			soapRequestData = sb.toString();

			// 记录返回参数;判断是因为在oracle的版本中;字段为CLOB；如果长度在1000-2000之间；会出现异常；手动补齐
			if (soapRequestData.length() >= 1000 && soapRequestData.length() <= 2000) {
				soapRequestData = StringUtils.rightPad(soapRequestData, 2008);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null)
				bufferedReader.close();
			if (inputStreamReader != null)
				inputStreamReader.close();
			if (inputStream != null)
				inputStream.close();
			postMethod.releaseConnection();
		}
		return soapRequestData;
	}
	static HostnameVerifier hv = new HostnameVerifier() {
		public boolean verify(String urlHostName, SSLSession session) {
			return true;
		}
	};
	/**
	 * 发送Http请求
	 * 
	 * @param reqUrl
	 * @param reqMeth
	 *            POST或GET
	 * @param reqParam
	 * @return
	 */
	public static String send(String reqUrl, String reqMeth, String reqParam) {

		DataOutputStream dataOutStream = null;
		OutputStream outputStream = null;
		InputStream inputStream = null;
		BufferedReader bufferedReader = null;
		InputStreamReader inputStreamReader = null;
		HttpURLConnection connection = null;
		try {

			URL url = new URL(reqUrl);
			trustAllHttpsCertificates();
			HttpsURLConnection.setDefaultHostnameVerifier(hv);

			connection = (HttpURLConnection) url
					.openConnection();
			connection.setConnectTimeout(30000);
			connection.setReadTimeout(30000);
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setRequestMethod(reqMeth);
			connection.setRequestProperty("Content-type", "text/html");
			connection.setRequestProperty("Charset", "UTF-8");
			connection.connect();

			if (reqMeth.equals("POST")) {

				outputStream = connection.getOutputStream();
				dataOutStream = new DataOutputStream(outputStream);
				dataOutStream.write(reqParam.getBytes("utf-8"));
				dataOutStream.flush();		
				outputStream.flush();
			}
			inputStream = connection.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
			bufferedReader = new BufferedReader(
					inputStreamReader);
			String lines;
			StringBuffer sb = new StringBuffer("");
			while ((lines = bufferedReader.readLine()) != null) {
				sb.append(lines);
			}
			log.info(sb.toString());
			// JSONObject js = JSONObject.fromObject(sb.toString());
			// if(js.containsKey("nickname")){
			// String nickName=js.getString("nickname");
			//				
			// if(EmojiFilter.containsEmoji(nickName)){
			// log.info("含有emoji表情:"+nickName);
			// String un=UnicodeConverter.string2Unicode(nickName);
			// log.info("un----------------------"+un);
			// String s =EmojiFilter.filterEmoji(sb.toString());
			// log.info(s);
			// }
			// }
			return sb.toString();

		} catch (Exception e) {

			e.printStackTrace();
			return "";
		} finally {
			try {
				if (dataOutStream != null)
					dataOutStream.close();
				if (outputStream != null)
					outputStream.close();
				if(bufferedReader!=null)
					bufferedReader.close();
				if (inputStreamReader != null)
					inputStreamReader.close();
				if (inputStream != null)
					inputStream.close();
				if(connection!=null)
					connection.disconnect();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	private static void trustAllHttpsCertificates() throws Exception {
		javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];
		javax.net.ssl.TrustManager tm = new miTM();
		trustAllCerts[0] = tm;
		javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext
				.getInstance("SSL");
		sc.init(null, trustAllCerts, null);
		HttpsURLConnection.setDefaultSSLSocketFactory(sc
				.getSocketFactory());
	}

	static class miTM implements javax.net.ssl.TrustManager,
			javax.net.ssl.X509TrustManager {
		public java.security.cert.X509Certificate[] getAcceptedIssuers() {
			return null;
		}

		public boolean isServerTrusted(
				java.security.cert.X509Certificate[] certs) {
			return true;
		}

		public boolean isClientTrusted(
				java.security.cert.X509Certificate[] certs) {
			return true;
		}

		public void checkServerTrusted(
				java.security.cert.X509Certificate[] certs, String authType)
				throws java.security.cert.CertificateException {
			return;
		}

		public void checkClientTrusted(
				java.security.cert.X509Certificate[] certs, String authType)
				throws java.security.cert.CertificateException {
			return;
		}
	}

}
