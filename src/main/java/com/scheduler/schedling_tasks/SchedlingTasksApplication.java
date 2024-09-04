package com.scheduler.schedling_tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedlingTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedlingTasksApplication.class, args);
	}

}
