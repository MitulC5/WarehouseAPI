package com.Assignment.ZaraWarehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableWebMvc
@SpringBootApplication
public class ZaraWarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZaraWarehouseApplication.class, args);
	}

}
