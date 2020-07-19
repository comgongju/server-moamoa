package com.comgongju.moamoa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class MoamoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoamoaApplication.class, args);
		System.out.println("Hello");
	}

}
