package the;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringJpaBoard04Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaBoard04Application.class, args);
	}

}
