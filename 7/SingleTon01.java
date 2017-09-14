package com.interview;

//饿汉模式
public class SingleTon01 {
	private SingleTon01(){}
	
	private static SingleTon01 instance = null;
	
	public static synchronized SingleTon01 getInstance() {
		if(instance == null)
			instance = new SingleTon01();
			return instance;
	}
}
