package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by yzp on 2016/5/9.
 */
@Configuration// 类似于spring配置文件，负责注册bean，对应的提供了@Bean注解
@EnableWebMvc //用于在基于Java类定义Bean配置中开启MVC支持，和XML中的<mvc:annotation-driven>功能一样；
@ComponentScan({"annotation"})
@Import({JpaConfig.class,ServiceConfig.class})//表示一个或多个@ Configuration } { @link配置类进口。
public class MvcConfig extends WebMvcConfigurerAdapter {
    /**
     * 描述 : <注册视图处理器>. <br>
     *<p>
     <使用方法说明>
     </p>
     * @return
     */

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        super.configureViewResolvers(registry);
//        registry.viewResolver(viewResolver());
//    }
}
