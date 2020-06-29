/**
 * FileName: HttpRequest
 * Author:   NingZhenPeng
 * Date:     2020/4/22 16:02
 * Description: HttpRest请求接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package cn.sh.ideal.valueaddedserver.common.util.http;

/**
 * @ClassName: HttpRequest
 * @Description HttpRequest请求接口
 * @Author NingZhenPeng
 * @Date 2020/4/22 16:02
 * @version 1.0
 * @since
 * @see
 */
public interface HttpRequest {


    /**
     * 方法描述: <br>
     * @Description Http get 请求接口
     * @param url
     * @return: String
     * @since: 1.0.0
     * @Author: NingZhenPeng
     * @Date: 2020/4/22 16:04
     */
    public String HttpGet(String url);


    /**
     * 方法描述: <br>
     * @Description Http post 请求接口 、请求报文json数据结构
     * @param url
     * @param paramJson
     * @return:String
     * @since: 1.0.0
     * @Author: NingZhenPeng
     * @Date: 2020/4/22 16:05
     */
    public String HttpPost(String url,String paramJson);
}
