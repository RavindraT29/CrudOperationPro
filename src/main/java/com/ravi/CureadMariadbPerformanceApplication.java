package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CureadMariadbPerformanceApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(CureadMariadbPerformanceApplication.class, args);
	}

}
