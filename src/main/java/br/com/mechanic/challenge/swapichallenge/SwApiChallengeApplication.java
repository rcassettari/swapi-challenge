package br.com.mechanic.challenge.swapichallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SwApiChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwApiChallengeApplication.class, args);
	}

}
