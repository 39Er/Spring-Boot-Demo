package com.liuwm.boot.my_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
//@Configuration
//@EnableAutoConfiguration
//默认扫描clsspath中的Component，以本类所在地package为起点
//@ComponentScan(basePackages={"com.liuwm.boot"})
//加载xml配置文件
@ImportResource({"classpath*:/spring-mvc.xml"/*,""*/})
@PropertySources(value={@PropertySource(value="classpath:applicationContext.properties",ignoreResourceNotFound=true),@PropertySource(value="classpath:log4j.properties")})
public class Application extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// TODO Auto-generated method stub
		return application.sources(Application.class);
	}
	public static void main(String[] args) throws Exception {
		//SpringApplication.run(Application.class, args);
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
	}
}