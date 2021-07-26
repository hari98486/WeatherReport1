package WeatherReportMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"Controller","Model","Repo","Service"})
@EntityScan( basePackages = {"Model"} )
@EnableJpaRepositories( basePackages = {"Repo"} )
public class WeatherReport1Application {

	public static void main(String[] args) {
		SpringApplication.run(WeatherReport1Application.class, args);
	}
}
