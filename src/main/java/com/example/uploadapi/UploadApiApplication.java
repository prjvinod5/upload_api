package com.example.uploadapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;


@SpringBootApplication
@RestController
public class UploadApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadApiApplication.class, args);
	}

}
