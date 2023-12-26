package com.drira.kafkaconsumer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class KafkaConsumerApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

	public NewTopic topic(){
		return TopicBuilder.name("drira").build();
	}

	@KafkaListener(id = "myId", topics = "drira")
	public void listen(String in){
		System.out.println(in);
	}
}
