package com.bankwithmint.mintconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "com.mintfintech.card_verified", groupId = "bankwithmint")
    public void consume(String message) {
        logger.info(String.format(">>> Consumed message -> %s", message));
    }
}