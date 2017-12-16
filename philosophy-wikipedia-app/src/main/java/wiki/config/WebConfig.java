package wiki.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "wiki.controllers" })
public class WebConfig {

	public WebConfig() {

	}
}
