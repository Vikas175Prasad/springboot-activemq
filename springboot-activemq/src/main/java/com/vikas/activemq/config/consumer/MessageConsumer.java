package com.vikas.activemq.config.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.vikas.activemq.model.SystemMessage;

@Component
public class MessageConsumer {

	public static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

	@JmsListener(destination = "messages-queue")
	public void messageListener(SystemMessage systemMessage) {
		LOGGER.info("Message received." + systemMessage);
	}
}
