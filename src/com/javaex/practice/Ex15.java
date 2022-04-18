package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
			int no = sc.nextInt();
			
			for(int z=1; z<=no; z++) {
				if(no%z==0) {
					System.out.println(z);
				} 
				}
			
		sc.close();
		
		
		
	}

}
