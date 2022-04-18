package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
			int no = sc.nextInt();
			int z = 0;
			
			for(int i=1; i<no; i++) {
				z = z+i;
				System.out.print(i+"+");
			}System.out.println(no);
			System.out.println("합계:"+(z+no));
			
		sc.close();

	}

}
