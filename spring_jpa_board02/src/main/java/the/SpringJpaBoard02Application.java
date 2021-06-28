package the;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringJpaBoard02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaBoard02Application.class, args);
	}

}
