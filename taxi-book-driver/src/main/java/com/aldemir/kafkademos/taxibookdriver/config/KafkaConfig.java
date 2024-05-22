package com.aldemir.kafkademos.taxibookdriver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.aldemir.kafkademos.taxibookdriver.constant.AppConstant.DRIVER_LOCATION;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(DRIVER_LOCATION)
                .build();
    }


}
