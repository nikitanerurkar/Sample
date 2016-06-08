package com.samplechecks;

import java.lang.reflect.Method;

public class Main {

	/**
	 * @param arg
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HelloWorld hello = new HelloWorld();
    int k=hello.square(4);
    System.out.println("square of 4 is " + k);
    
    Class helloWorldClass=HelloWorld.class;
    String classname=helloWorldClass.getName();
    System.out.println("Classname : "+classname);
    Method[] method = helloWorldClass.getMethods();
    System.out.println(method[0]);
   
}
}	
	
