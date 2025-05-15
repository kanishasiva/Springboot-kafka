package com.example.Cab_book_driver.service;

import com.example.Cab_book_driver.constant.Appconstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Cablocationservice {

    @Autowired   //{since it is producer(publisher) we are using this kafkatemplate}
    private KafkaTemplate<String,Object> kafkaTemplate; // {kafka template will help us to create the template for
                                                        // storing mydata to apache kafka cluster and in which topic
                                                       //   we need to send data }

    public boolean updatelocation(String location){
        kafkaTemplate.send(Appconstant.CAB_LOCATION,location);
        return true;
    }
}
