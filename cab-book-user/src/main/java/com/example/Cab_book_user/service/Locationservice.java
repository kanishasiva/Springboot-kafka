package com.example.Cab_book_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Locationservice {

    //{Since it is consumer(subscriber) we use kafkalisterner }
    @KafkaListener(topics = "test-topic" , groupId = "cab-user-group")
    public void cablocation(String location){
            System.out.println(location);
    }
}
