package bank.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories(basePackages = "bank.com.repository")
@SpringBootApplication
public class MyBankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBankAppApplication.class, args);
	}
}
	