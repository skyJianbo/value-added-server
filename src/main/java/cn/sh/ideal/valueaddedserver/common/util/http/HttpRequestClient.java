/**
 * FileName: HttpRequestClient
 * Author:   NingZhenPeng
 * Date:     2020/4/22 16:07
 * Description: HttpRequest 请求接口客户端实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.sh.ideal.valueaddedserver.common.util.http;

import cn.sh.ideal.valueaddedserver.common.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: HttpRequestClient
 * @Description HttpRequest 请求接口客户端实现
 * @Author NingZhenPeng
 * @Date 2020/4/22 16:07
 * @version 1.0
 * @since
 * @see
 */
@Service
@Slf4j
public class HttpRequestClient implements HttpRequest {



    @Autowired
    private RestTemplate restTemplate;


    /**
     * 方法描述: <br>
     *
     * @param url
     * @Description Http get 请求接口
     * @return: String
     * @since: 1.0.0
     * @Author: NingZhenPeng
     * @Date: 2020/4/22 16:04
     */
    @Override
    public String HttpGet(String url) {

        // restTemplate get请求
        String result = null;
        try {
            log.info("{}，restTemplate get请求，完整资源路径：{}",Thread.currentThread().getId(),url);
            log.info("{}，restTemplate get请求，请求报文：{}",Thread.currentThread().getId(),url);

            //result = this.restTemplate.getForObject(url, String.class);
            ResponseEntity<String> responseEntity = this.restTemplate.getForEntity(url, String.class);
            HttpStatus statusCode = responseEntity.getStatusCode();
            log.info("{}，restTemplate get请求，请求状态：{}",Thread.currentThread().getId(),statusCode);

            if(statusCode != HttpStatus.OK){
                log.error("{}，restTemplate get请求失败，失败内容：{}",Thread.currentThread().getId(),responseEntity.getBody());
                return null;
            }else{
                result = responseEntity.getBody();
                log.info("{}，restTemplate get请求，返回报文：{}",Thread.currentThread().getId(),result);
            }

        } catch (RestClientException e) {
            log.error("{}，restTemplate get请求异常，异常内容：{}",Thread.currentThread().getId(),e.getMessage());
            return null;
        }

        if(StringUtil.isEmpty(result)){
            log.error("{}，restTemplate get请求，返回内容为空",Thread.currentThread().getId());
            return null;
        }else{
            return result;
        }
    }



    /**
     * 方法描述: <br>
     *
     * @param url
     * @param paramJson
     * @Description Http post 请求接口 、请求报文json数据结构
     * @return:String
     * @since: 1.0.0
     * @Author: NingZhenPeng
     * @Date: 2020/4/22 16:05
     */
    @Override
    public String HttpPost(String url, String paramJson) {

        // restTemplate post请求
        String result = null;
        try {

            log.info("{}，restTemplate post请求，完整资源路径：{}",Thread.currentThread().getId(),url);
            log.info("{}，restTemplate post请求，请求报文：{}",Thread.currentThread().getId(),paramJson);

            result = handleHttpPost(url, paramJson, this.restTemplate);

            log.info("{}，restTemplate post请求，返回报文：{}",Thread.currentThread().getId(),result);

        } catch (RestClientException e) {
            log.error("{}，restTemplate post请求异常，异常内容：{}",Thread.currentThread().getId(),e.getMessage());
            return null;
        }

        if(StringUtil.isEmpty(result)){
            log.error("{}，restTemplate post请求，返回内容为空",Thread.currentThread().getId());
            return null;

        }else{
            return result;
        }
    }

    /**
     * 方法描述: <br>
     * @Description Http post 请求接口 处理
     * @param url
     * @param paramJson
     * @param restTemplate
     * @return:
     * @since: 1.0.0
     * @Author: NingZhenPeng
     * @Date: 2020/4/22 16:33
     */
    public static String handleHttpPost(String url, String paramJson, RestTemplate restTemplate) {
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        HttpEntity<String> entity = new HttpEntity<String>(paramJson,headers);

        // String result = restTemplate.postForObject(url,entity,String.class);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url,entity,String.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        log.info("{}，restTemplate post请求，请求状态：{}",Thread.currentThread().getId(),statusCode);

        if(statusCode != HttpStatus.OK){
            log.error("{}，restTemplate post请求失败，失败内容：{}",Thread.currentThread().getId(),responseEntity.getBody());
            return null;
        }else{
            String result = responseEntity.getBody();
            log.info("{}，restTemplate post请求，返回报文：{}",Thread.currentThread().getId(),result);
            return result;
        }

    }
}
