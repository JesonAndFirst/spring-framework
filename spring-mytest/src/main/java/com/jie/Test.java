package com.jie;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lishijie
 * @description TODO
 * @date 2023/11/18 16:34
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}
