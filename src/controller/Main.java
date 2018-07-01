package controller;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class Main extends SpringBootServletInitializer{

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/home")
	String home2() {
		return "Hello World!";
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(Main.class);
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}

}