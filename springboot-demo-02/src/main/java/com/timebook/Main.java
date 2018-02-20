package com.timebook;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * @title: Main
 * @author: xiongzl
 * @date: 2018/2/17
 * @descprition: springboot 项目启动类
 */
@SpringBootApplication
public class Main extends WebMvcConfigurerAdapter{
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		/**
		 * 1. 定义一个convert消息转换对象
		 * 2. 添加fastJson的配置信息
		 * 3. 在convert中添加配置信息
		 * 4. 将convert添加到converters当中
		 */

		// 1. 定义一个convert消息转换对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

		FastJsonConfig fastJsonConfig = new FastJsonConfig();

		// 2. 添加fastJson的配置信息
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		// 3. 在convert中添加配置信息
		fastConverter.setFastJsonConfig(fastJsonConfig);
		// 4. 将convert添加到converters当中
		converters.add(fastConverter);
	}
}
