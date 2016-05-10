package annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * JpaConfig
 *
 * @author Yangzp
 * @date 2016/5/10
 */
@Configuration//显式地指定相关联的Spring bean定义的名称。如果未指定的(常见的情况),将自动生成一个bean名称。
// 自定义名字只适用于如果配置类是直接拿起通过组件扫描或提供{ @link所}.如果配置类注册为传统的XML bean定义,bean的名称/ id元素将优先考虑。
@EnableJpaRepositories({"repository"})
public class JpaConfig {

}
