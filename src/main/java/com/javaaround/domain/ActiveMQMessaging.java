package com.javaaround.domain;

public class ActiveMQMessaging implements Messaging{

	public void sentMessage(){
		System.out.println("Sending Message via Active MQ");
	}
}