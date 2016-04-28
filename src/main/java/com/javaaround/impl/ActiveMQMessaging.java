package com.javaaround.impl;

import com.javaaround.domain.Messaging;

public class ActiveMQMessaging implements Messaging{

	public void sendMessage(){
		System.out.println("Sending Message via Active MQ");
	}
}