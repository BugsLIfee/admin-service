package com.erbf.bugsLife;


import com.erbf.bugsLife.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableConfigurationProperties(AppProperties.class)
@SpringBootApplication
public class AdminServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(AdminServiceApplication.class, args);
	}

}
////public class BugsLifeApplication extends SpringBootServletInitializer {
////
////	public static void main(String[] args) {
////		final SpringApplicationBuilder builder = new SpringApplicationBuilder(BugsLifeApplication.class);
////		builder.beanNameGenerator(new CustomBeanNameGenerator());
////		builder.run(args);
////		SpringApplication.run(BugsLifeApplication.class, args);
////	}
////
////	@Override
////	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationbuilder) {
////		return applicationbuilder.sources(BugsLifeApplication.class);
//	}
//	
//	
//}
