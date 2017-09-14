package com.interview;

//饱汉模式
public class SingleTon {

	private SingleTon() {}
	
	private static final SingleTon instance = new SingleTon();
	
	public static SingleTon getInstance() {
		
		return instance;
		
	}
	
}
