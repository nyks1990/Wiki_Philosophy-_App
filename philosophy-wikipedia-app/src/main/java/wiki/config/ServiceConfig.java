package wiki.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "wiki.services" })
public class ServiceConfig {

	public ServiceConfig() {

	}
}
