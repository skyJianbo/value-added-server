package cn.sh.ideal.valueaddedserver.common.annotation;

import java.lang.annotation.*;

/**
 * 方法描述: <br>
 * @Description 获取HTTP 请求头的信息及参数 切面注解
 * @since: 1.0.0
 * @Author: NingZhenPeng
 * @Date: 2020/5/13 10:11
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Documented
public @interface HttpAnnotation {

    String value() default  "";
}
