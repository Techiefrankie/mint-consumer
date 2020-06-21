package com.bankwithmint.mintconsumer;

import com.bankwithmint.mintconsumer.service.KafkaConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MintconsumerApplication {

    @Autowired
    KafkaConsumerService consumerService;

    public static void main(String[] args) {
        SpringApplication.run(MintconsumerApplication.class, args);
    }

}
