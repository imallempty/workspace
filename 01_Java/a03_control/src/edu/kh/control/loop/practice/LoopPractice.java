package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			} 
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i = input; i >= 1; i--) {
			System.out.print(i +" ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= input; i++) {
			
			sum += i;
			
			if(i < input) {
				System.out.printf("%d + ",i);
			} else {
				System.out.printf("%d ",i);
			}
			
		
		}
		
		System.out.print("= " + sum);
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		/* 
		 * 다른 풀이법
		if(num1 > num2) {
			// 먼저 입력한 수가 더 큰 경우
			
			// 두 변수의 값 교환(임시 변수 필요)
			int temp = num1;
			num1 = num2;
			num2 = temp;
			
			for(int v = num1; v<= num2; v++) {
				System.out.print(v + " ");
			}
		}
		*/
		
		if(num1 >= 1 && num2 >= 1) {
			if(num1 <= num2) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int x = num2; x <= num1; x++) {
					System.out.print(x + " ");
				}
					
			} 
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input =sc.nextInt();
		
		System.out.printf("======%d단========\n",input);
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", input, i,input*i);
		}
		
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input =sc.nextInt();
		
		for(int dan = input; dan <= 9; dan++ ) {
			System.out.printf("======%d단========\n",dan);
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d \n", dan, i ,dan*i);
			}
		}
	}
	

	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int row = input; row >=1; row-- ) {
			for(int col = 1; col<= row; col++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
	}
				
			
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
	}
	
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		int count = 0;	
			
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0  || i % 3 == 0) {
				System.out.printf("%d ",i);
			}
			if(i % 2 == 0 && i % 3 == 0) {
				count += 1;
			}
			
		}
		
		System.out.println();
		System.out.print("count : " + count );
	}
	
	
	
	
}

