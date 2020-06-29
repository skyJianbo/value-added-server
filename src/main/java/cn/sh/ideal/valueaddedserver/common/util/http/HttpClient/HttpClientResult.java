/**
 * FileName: HttpClientResult
 * Author:   NingZhenPeng
 * Date:     2020/4/20 16:10
 * Description: 封装httpClient响应结果
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.sh.ideal.valueaddedserver.common.util.http.HttpClient;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @ClassName: HttpClientResult
 * @Description 封装httpClient响应结果
 * @Author NingZhenPeng
 * @Date 2020/4/20 16:10
 * @version 1.0
 * @since
 * @see
 */
@Component
@Data
public class HttpClientResult implements Serializable {

    public HttpClientResult() {
    }

    /**
     * 响应状态码
     */
    private int code;

    /**
     * 响应数据
     */
    private String content;


    public HttpClientResult(int code, String content) {
        this.code = code;
        this.content = content;
    }


    public HttpClientResult(int code) {
        this.code = code;
    }
}
