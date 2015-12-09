package com.liuwm.boot.my_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
//@Configuration
//@EnableAutoConfiguration
//默认扫描clsspath中的Component，以本类所在地package为起点
//@ComponentScan(basePackages={"com.liuwm.boot"})
//加载xml配置文件
//@ImportResource({"",""})
@PropertySources(value={@PropertySource(value="applicationContext.properties",ignoreResourceNotFound=true)})
public class Application {
	public static void main(String[] args) throws Exception {
		//SpringApplication.run(Application.class, args);
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
	}
}