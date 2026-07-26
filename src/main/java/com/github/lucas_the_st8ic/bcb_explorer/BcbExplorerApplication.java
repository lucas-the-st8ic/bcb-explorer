package com.github.lucas_the_st8ic.bcb_explorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BcbExplorerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcbExplorerApplication.class, args);
	}

}
