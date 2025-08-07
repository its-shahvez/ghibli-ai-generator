package in.shahvez.ghibliaibackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GhibliaibackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhibliaibackendApplication.class, args);
	}

}
