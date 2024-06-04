package se.norrwing.itslek9demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import se.norrwing.itslek9demo.config.RsaKeyProperties;


@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class ItsLek9DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItsLek9DemoApplication.class, args);
	}

}
