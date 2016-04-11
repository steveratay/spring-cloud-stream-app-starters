package org.springframework.cloud.stream.app.httpclient.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HttpclientProcessorKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpclientProcessorKafkaApplication.class, args);
	}
}
