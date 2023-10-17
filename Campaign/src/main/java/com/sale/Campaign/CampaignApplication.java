package com.sale.Campaign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CampaignApplication {


	public static void main(String[] args) {
		SpringApplication.run(CampaignApplication.class, args);
	}

}
