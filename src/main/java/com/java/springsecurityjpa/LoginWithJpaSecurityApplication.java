package com.java.springsecurityjpa;

import com.java.springsecurityjpa.db.User;
import com.java.springsecurityjpa.repository.userRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = userRepository.class)


public class LoginWithJpaSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginWithJpaSecurityApplication.class, args);
    }

}
