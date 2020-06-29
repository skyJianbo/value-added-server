/**
 * FileName: ApiConfig
 * Author:   NingZhenPeng
 * Date:     2020/4/20 15:51
 * Description: Http请求配置
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.sh.ideal.valueaddedserver.common.util.http.restTemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ApiConfig
 * @Description Http请求配置
 * @Author NingZhenPeng
 * @Date 2020/4/20 15:51
 * @version 1.0
 * @since
 * @see
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(ClientHttpRequestFactory factory) {
        return new RestTemplate(factory);
    }

    @Bean
    public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        /*
        默认的是JDK提供http连接，需要的话可以
        通过setRequestFactory方法替换为例如Apache HttpComponents、Netty或
        OkHttp等其它HTTP library
        */
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(5000);//单位为ms
        factory.setConnectTimeout(5000);//单位为ms
        return factory;
    }

}