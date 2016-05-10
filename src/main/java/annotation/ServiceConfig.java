package annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ServiceConfig
 *
 * @author Yangzp
 * @date 2016/5/10
 */
@Configuration
@ComponentScan({"repository"})
@EnableTransactionManagement
@ImportResource({"classpath:spring_dev.xml"})
public class ServiceConfig {
}
