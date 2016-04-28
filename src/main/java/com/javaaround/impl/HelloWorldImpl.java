package com.javaaround.impl;

import com.javaaround.domain.HelloWorld;

public class HelloWorldImpl implements HelloWorld{

	public void sayHello(String name){
		System.out.println("Hello, " + name);
	}
}