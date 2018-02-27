package com.timebook;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.timebook.filter.OriginFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.Filter;


/**
 * The type Main.
 *
 * @title: Main
 * @author: xiongzl
 * @date: 2018 /2/17
 * @descprition: springboot 项目启动类
 */
@SpringBootApplication
public class Main extends WebMvcConfigurerAdapter{
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	/**
	 * Fast json http message converters http message converters.
	 *
	 * @return org.springframework.boot.autoconfigure.web.HttpMessageConverters http message converters
	 * @methodName fastJsonHttpMessageConverters
	 * @author xiongzl
	 * @date 2018 /2/17
	 * @Param
	 * @desc 使用 @Bean的方式注入FastJsonHttpMessageConverter对象
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		// 1. 定义一个convert消息转换对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

		FastJsonConfig fastJsonConfig = new FastJsonConfig();

		// 2. 添加fastJson的配置信息
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		// 3. 在convert中添加配置信息
		fastConverter.setFastJsonConfig(fastJsonConfig);
		// 4. 将convert添加到converters当中
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}


	/**
	 * 配置过滤器
	 *
	 * @return filter registration bean
	 */
	@Bean
	public FilterRegistrationBean someFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(originFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("sessionFilter");
		return registration;
	}

	/**
	 * Origin filter filter.
	 *
	 * @return the filter
	 */
	@Bean(name = "originFilter")
	public Filter originFilter() {
		return new OriginFilter();
	}







}
