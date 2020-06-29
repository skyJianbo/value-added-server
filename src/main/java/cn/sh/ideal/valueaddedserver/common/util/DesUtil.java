package cn.sh.ideal.valueaddedserver.common.util;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.io.IOException;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Date;
import java.util.ResourceBundle;


public class DesUtil {

	private static byte[] IV = { 0x12, 0x34, 0x56, 0x78, (byte) 0x90,
			(byte) 0xAB, (byte) 0xCD, (byte) 0xEF };

	public static String encrypt(String userTel) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("appconf");
		String appCode = rb.getString("integralappCode");
		String key = rb.getString("integralkey");
		String integralURL = rb.getString("integralURL");
		String timestamp = DateUtil.getDateStrCompact(new Date());
		String[] str = { appCode, userTel, timestamp };
		Arrays.sort(str);
		String bigStr = str[0] + str[1] + str[2];
		String sign = new SHA1().getDigestOfString(bigStr.getBytes())
				.toLowerCase();
		String data = appCode + "|" + userTel + "|" + timestamp + "|"
				+ sign.toUpperCase();

		System.out.println("data===" + data);
		String sertoken = encrypt(data, key);
		System.out.println("sertoken===" + sertoken);
		integralURL = integralURL.replace("###", URLEncoder.encode(sertoken));
		return integralURL;
	}

	/**
	 * 加密
	 * @param data 待加密的明文
	 * @param key 加密密钥
	 * @return 密文
	 * @throws Exception
	 */
	public static String encrypt(String data, String key) throws Exception {
		SecureRandom sr = new SecureRandom();
		DESKeySpec ks = new DESKeySpec(key.getBytes("UTF-8"));
		SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
		SecretKey sk = skf.generateSecret(ks);
		Cipher cip = Cipher.getInstance("DES/CBC/PKCS5Padding");// Cipher.getInstance("DES");
		IvParameterSpec ivSpec = new IvParameterSpec(IV);
		cip.init(Cipher.ENCRYPT_MODE, sk, ivSpec);// IV的方式
		// cip.init(Cipher.ENCRYPT_MODE, sk, sr);//没有传递IV
		return new String(new Base64().encode(cip.doFinal(data
				.getBytes("UTF-8"))));

	}

	/**
	 * 解密
	 * @param data 待解密的密文
	 * @param key 解密密钥
	 * @return 明文
	 * @throws IOException
	 * @throws Exception
	 */
	public static String decrypt(String data, String key) throws IOException,
			Exception {
		if (data == null) {
			return null;
		}

		byte[] buf = new Base64().decode(data.getBytes("UTF-8"));

		SecureRandom sr = new SecureRandom();

		DESKeySpec dks = new DESKeySpec(key.getBytes("UTF-8"));
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey securekey = keyFactory.generateSecret(dks);
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		IvParameterSpec ivSpec = new IvParameterSpec(IV);
		cipher.init(Cipher.DECRYPT_MODE, securekey, ivSpec);

		// cipher.init(Cipher.DECRYPT_MODE, securekey, sr);//没有传递IV

		return new String(cipher.doFinal(buf));
	}


	/*
	public static void main(String[] args) throws Exception {
		*//*String key = "ideal123";
		String userTel = "http://www.baidu.com/";
		
		System.out.println(userTel);
		String token = DesUtil.encrypt(userTel, key);
		System.out.println(token);
		String text = DesUtil.decrypt(token, key);
		System.out.println(text);*//*

		System.out.println(DesUtil.encrypt("oPpqwjpRhW19uscjI7-vplsVLSbA", "afbcccccee").replaceAll("A_a", "\\+"));
		
		System.out.println(DesUtil.decrypt("Ud5WlELCR/5V3vCSP+E4WCMF8170iyV7VnegkPObXwA=".replaceAll("A_a", "\\+"), "afbcccccee"));
	}
	*/

}
