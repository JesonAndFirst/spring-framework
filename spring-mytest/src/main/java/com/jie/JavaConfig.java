package com.jie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lishijie
 * @description TODO
 * @date 2023/11/18 16:31
 */
@Configuration
@ComponentScan
public class JavaConfig {


	@Bean
	public User user(){
		return new User("lsj",1);
	}
}
