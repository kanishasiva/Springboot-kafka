package com.example.Cab_book_driver.config;

import com.example.Cab_book_driver.constant.Appconstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Kafkaconfig {

    // we need to create topic in kafka so we are giving this method
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(Appconstant.CAB_LOCATION).build();
    }
}
