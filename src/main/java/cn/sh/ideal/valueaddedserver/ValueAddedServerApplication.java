package cn.sh.ideal.valueaddedserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mr_zhao
 */ //	开启servlet扫描
//	Servlet、Filter、Listener 可以直接通过 @WebServlet、@WebFilter、@WebListener 注解自动注册
@ServletComponentScan
//	开启事物管理 在需要（save、delete、update的 service上 注解@Transactional 即可）
//	默认配置下 Spring 只会回滚运行时、未检查异常（继承自 RuntimeException 的异常）或者 Error
//	需要注意 在service 抛出异常请使用 throw new RuntimeException("save 抛异常了");  或者
//	TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
//	否则 事物将不会回滚
@EnableTransactionManagement
@MapperScan(basePackages={"cn.sh.ideal.valueaddedserver.*.mapper"})
@SpringBootApplication
public class ValueAddedServerApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ValueAddedServerApplication.class);
        application.run(args);
    }

}
