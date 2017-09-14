package com.imooc.algor;

import java.util.ArrayList;
import java.util.List;

public class CalcAge {
	
	List<Integer> list = new ArrayList<Integer>();
	private int i = 1;
	private List<Integer> getAgeList(int firstAge) {
		while (i < 10) {
			i++;
			list.add(firstAge);
			getAgeList(firstAge + 2);
		}
		return list;
	}
	private int getAge(int index) {
		
		return list.get(index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcAge calcAge = new CalcAge();
		
		calcAge.getAgeList(10);
		
		System.out.println("list:" + calcAge.list);
		
		System.out.println("年龄：" + calcAge.getAge(9));
	}

}
