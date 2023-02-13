package com.project.ey.bluepy.onlinePayment;

import com.project.ey.bluepy.onlinePayment.repositories.impl.CustomMongoRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories( repositoryBaseClass = CustomMongoRepositoryImpl.class)
public class BluepyOnlinePaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BluepyOnlinePaymentApplication.class, args);
	}

}
