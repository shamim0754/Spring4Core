package com.javaaround.domain;

public class HelloWorldImpl implements HelloWorld{

	public void sayHello(String name){
		System.out.println("Hello, " + name);
	}
}