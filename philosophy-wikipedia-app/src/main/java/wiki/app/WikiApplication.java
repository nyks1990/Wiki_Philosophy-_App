package wiki.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import wiki.config.PersistenceConfig;
import wiki.config.SecurityConfig;
import wiki.config.ServiceConfig;
import wiki.config.WebConfig;

@SpringBootApplication
@Import({ PersistenceConfig.class, ServiceConfig.class, SecurityConfig.class, WebConfig.class

})
public class WikiApplication {

	public static void main(final String[] args) {
		SpringApplication.run(WikiApplication.class, args);
	}
}
