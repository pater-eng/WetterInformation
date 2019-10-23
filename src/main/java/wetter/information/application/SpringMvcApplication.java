package wetter.information.application;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(SpringMvcApplication.class, args);
		System.out.println(ctx.getApplicationName());
		System.out.println("PATER-ENG");

	}
}
