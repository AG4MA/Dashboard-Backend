package com.DashboardBackend.DashboardBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DashboardBackendApplication {



	public static void main(String[] args) {
		SpringApplication.run(DashboardBackendApplication.class, args);
	}

	@RestController
	@RequestMapping("/data")
	public class DataController {

		@GetMapping
		public ResponseEntity<String> getData() {
			String data = "Hello, world!";
			return ResponseEntity.ok(data);
		}

	}
}
