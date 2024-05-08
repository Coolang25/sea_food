package edu.quattrinh.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"edu.quattrinh.library.*", "edu.quattrinh.customer.*"})
@EnableJpaRepositories(value = "edu.quattrinh.library.repository")
@EntityScan(value = "edu.quattrinh.library.model")
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

}
