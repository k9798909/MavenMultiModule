package com.example.webapp;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.utils.Utils;

@SpringBootApplication
public class WebappApplication {

	public static void main(String[] args) {
		// 使用其他模塊的方法以及套件 StringUtils在其他模塊引入
		Utils.doUtilsMethod();
		StringUtils.isNotBlank("");
		SpringApplication.run(WebappApplication.class, args);
	}

}
