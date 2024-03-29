package com.github.hotire.springkafka.core.consumer;

import org.springframework.kafka.listener.MessageListenerContainer;
import org.springframework.kafka.support.converter.MessageConverter;

/**
 * @see org.springframework.kafka.config.KafkaListenerEndpoint
 * @see org.springframework.kafka.config.AbstractKafkaListenerEndpoint
 * @see org.springframework.kafka.config.MethodKafkaListenerEndpoint
 */
public class KafkaListenerEndpointCore {

    /**
     * @see org.springframework.kafka.config.AbstractKafkaListenerEndpoint#setupListenerContainer(MessageListenerContainer, MessageConverter)
     */
    public void setupListenerContainer(MessageListenerContainer listenerContainer, MessageConverter messageConverter) {

    }
}
