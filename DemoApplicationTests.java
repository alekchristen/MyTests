package io.reflectoring.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootTest
@SpringBootApplication
@RestController
class DemoApplicationTests {

		public static void main(String[] args) {
			SpringApplication.run(DemoApplicationTests.class, args);
		}


}
