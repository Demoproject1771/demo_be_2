package com.example.demo2.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo2.dto.FileEvent;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DataConsumer {

    @KafkaListener(topics = "data-topic", groupId = "demo2-group")
    public void consume(FileEvent event) {
        System.out.println("==========================================");
        System.out.println("Demo2 receive message from Demo:");
        System.out.println("Action: " + event.getActionType());
        System.out.println("File Path: " + event.getFilePath());
        System.out.println("Job ID: " + event.getJobId());
        System.out.println("==========================================");
    }
}
