package com.netlink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PocServiceKuberApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocServiceKuberApplication.class, args);
	}

}
