package com.javaex.practice;

public class Ex01 {

	public static void main (String[]args) {
		
		System.out.println("while문");
		int index = 0;
		while (index < 3) {
			System.out.println("index=" + index);
			index++;
		}
		//0부터 2까지 반복됨
		
		System.out.println("for문");
		for(int order=0; order<3; order++) {
			System.out.println("order=" + order);
		}
		//0부터 2까지 반복됨
		
	} 
	
}
