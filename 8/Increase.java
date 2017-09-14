package com.imooc.algor;

public class Increase {
	private void IncNum(int n){
		System.out.println(n);
		if (n <= 5000) {
			IncNum(n*2);
			System.out.println(n);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Increase i = new Increase();
		i.IncNum(1237);
	}

}
