package cn.sh.ideal.valueaddedserver.common.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Aspect
@Component
public class HttpAspect {

    /*
    切面五个注解
    @Before  在切点方法之前执行；
    @After  在切点方法之后执行；
    @AfterReturning 切点方法返回后执行；
    @AfterThrowing 切点方法抛异常执行
    @Around 属于环绕增强，能控制切点执行前，执行后，，用这个注解后，程序抛异常，会影响@AfterThrowing这个注解
    */

    /**
     * 方法描述: <br>
     * @Description
     * 这里我们使用注解的形式
     * 当然，我们也可以通过切点表达式直接指定需要拦截的package,需要拦截的class 以及 method
     * 切点表达式:   execution(...)
     * @since: 1.0.0
     * @Author: NingZhenPeng
     * @Date: 2020/5/13 10:28
     */
    @Pointcut("@annotation(cn.sh.ideal.valueaddedserver.common.annotation.HttpAnnotation)")
    public void annotationPointcut() {

    }

    /**
     * 方法描述: <br>
     * @Description 在切点方法之前执行
     * @since: 1.0.0
     * @Author: NingZhenPeng
     * @Date: 2020/5/13 10:29
     */
    @Before("annotationPointcut()")
    public void beforePointcut(JoinPoint joinPoint) {
        log.info("前置通知执行了!");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //URL
        log.info("URL={}",request.getRequestURL());
        //Method
        log.info("Method={}",request.getMethod());
        //IP
        log.info("IP={}",request.getRemoteAddr());
        //Class.Method
        log.info("CLass.Method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName()+"()");
        //Args
        log.info("Args={}",joinPoint.getArgs());
    }


    /**
     * 方法描述: <br>
     * @Description 在切点方法之后执行
     * @since: 1.0.0
     * @Author: NingZhenPeng
     * @Date: 2020/5/13 10:29
     */
    @After("annotationPointcut()")
    public void afterPointcut(JoinPoint joinPoint) {
        log.info("后置通知执行了!");
    }


    /**
     * 方法描述: <br>
     * @Description 切点方法返回后执行
     * 在切入点return内容之后切入内容（可以用来对处理返回值做一些加工处理）
     * @since: 1.0.0
     * @Author: NingZhenPeng
     * @Date: 2020/5/13 10:29
     */
    @AfterReturning("annotationPointcut()")
    public void doAfterReturning(JoinPoint joinPoint) {
        log.info("后置返回通知执行了!");
    }



    /**
     * 方法描述: <br>
     * @Description  环绕通知
     * 注意:Spring AOP的环绕通知会影响到AfterThrowing通知的运行,不要同时使用
     * 环绕通知非常强大，可以决定目标方法是否执行，什么时候执行，执行时是否需要替换方法参数，执行完毕是否需要替换返回值。
     * 环绕通知第一个参数必须是org.aspectj.lang.ProceedingJoinPoint类型
     * @since: 1.0.0
     * @Author: NingZhenPeng
     * @Date: 2020/5/13 10:29
     */
    @Around("annotationPointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("环绕通知执行了!");
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletResponse response = servletRequestAttributes.getResponse();

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        // 获取参数名称
        String[] params = methodSignature.getParameterNames();
        // 获取参数值
        Object[] args = joinPoint.getArgs();

        if (null == params || params.length == 0){
            String mes = "Using Token annotation, the token parameter is not passed, and the parameter is not valid.";
            log.info(mes);
            throw new Exception(mes);
        }

        Object obj = null;
        try {
            //可以加参数
            obj = joinPoint.proceed();
            log.info(obj.toString());
            //response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        log.info("@Around环绕通知执行结束");
        return obj;
    }



    /**
     * 后置异常通知
     *  定义一个名字，该名字用于匹配通知实现方法的一个参数名，当目标方法抛出异常返回后，将把目标方法抛出的异常传给通知方法；
     *  throwing:限定了只有目标方法抛出的异常与通知方法相应参数异常类型时才能执行后置异常通知，否则不执行，
     *            对于throwing对应的通知方法参数为Throwable类型将匹配任何异常。
     * @param joinPoint
     * @param exception
     */
    @AfterThrowing(value = "annotationPointcut()",throwing = "exception")
    public void doAfterThrowingAdvice(JoinPoint joinPoint,Throwable exception) {
        log.info(joinPoint.getSignature().getName());
        if (exception instanceof NullPointerException) {
            log.info("发生了空指针异常!!!!!");
        }
    }





}
