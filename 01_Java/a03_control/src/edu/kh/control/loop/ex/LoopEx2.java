package edu.kh.control.loop.ex;

import java.util.Scanner;

public class LoopEx2 {
	
	// 구구단 2단 출력하기
	
	public void ex1() {
		
		System.out.println("구구단 2단 출력하기");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 X %d = %d \n", i, 2*i);
		}
		
	}
	
	// 입력받은 단 출력하기
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		System.out.printf("\n[구구단 %d단]\n", dan);
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d \n", dan, i, dan*i);
		}
	}

	// 입력 받은 단 출력하기
	// 조건 : 입력 받은 값이 2 ~ 9 사이일 떄만 구구단 출력
	// 			2 ~ 9 사이가 아닐 경우 "잘못 입력 하셨습니다." 출력
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
				
		if (dan >= 2 && dan <= 9) { 
			System.out.printf("\n[구구단 %d단]\n", dan);
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", dan, i, dan*i);
			}
		} else {
				System.out.println("잘못 입력 하셨습니다.");
			}
				
	}
	
	// 5 4 3 2 1 출력하기 (반복문 사용해서)
	
	public void ex4() {
		for(int i = 5; i >= 1 ; i--) {
			System.out.printf("%d ", i);
		} 
	}
	
	// 9 8 7 6 5 4 출력
	
	public void ex5() {
		// i >= 4 == i >3
		for(int i = 9; i >= 4; i--) {
			System.out.printf("%d ", i);
		}
	}
	
	/* 중첩 반복문 */
	// 12345
	// 12345
	// 12345
	// 12345
	// 12345
	
	public void ex6() {
		
		// 5회 반복
		for(int x = 1; x <= 5; x++) {
			
			// 반복하면서 12345 출력
			for(int i = 1; i <= 5; i++) {
				System.out.print(i);
			}
			System.out.println(); //12345 출력 후 줄 바꿈
		}
	}
	
	//54321
	//54321
	//54321
	//54321

	public void ex7() {
		
		for (int x = 1; x <= 4; x++) {
			for(int i = 5; i >= 1; i--) {
				System.out.print(i);
			} System.out.println();
		}
		
	}
	
	// (0,0) (0,1) (0,2)
	// (1,0) (1,1) (1,2)
	public void ex8() {
		
		// ()내부 첫번째 칸의 값 0 1
		for(int x = 0; x <= 1; x++) {
		
		// ()내부 두번째 칸의 값 0 1 2
			for(int i = 0; i <= 2; i++) {
				System.out.printf("(%d,%d)",x,i);
			} 
			System.out.println();
		}
	}
	
	
	// 2단부터 9단까지 모두 출력하기
	public void ex9() {
		
		for(int dan = 2; dan <= 9; dan++ ) {
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", dan, i, dan*i);
			} 
			System.out.println("---------------------------");
		}
	}
	
	// 9단부터 2단까지 모두 출력하기
	
	//[9단]
	// 9 X 1 = 9
	// 9 X 2 = 18
	//...
	//[8단]
	// 8 X 1 = 8
	// 8 X 2 = 16
	// ...
	
	public void ex10() {
		
		for(int dan = 9; dan >= 2; dan--) {
			
			System.out.printf("[%d단] \n", dan);
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", dan, i, dan*i);
			} 
			System.out.println("-------------------------------------------");
		}
	}
	
	// 구구단 출력하기
	// 조건 
	// - 1 입력시 2 ~ 9 순서로 출력
	// - 2 입력시 9 ~ 2 역순으로 출력
	// - 1, 2가 아니면 "잘못 입력 하셨습니다" 출력
	public void ex11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1) 2 ~ 9 순서대로, 2) 9 ~ 2 역순으로 : ");
		int input = sc.nextInt();
		
		if (input == 1 ) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.printf("[%d단] \n", dan);
				for(int i = 1; i <= 9; i++ ) {
					System.out.printf("%d X %d = %d \n", dan, i, dan*i);
					} 	
				System.out.println("------------------");
				}
			} else if (input == 2) {
				for(int dan = 9; dan >= 2; dan--) {
					System.out.printf("[%d단] \n", dan);
					for(int i = 1; i <= 9; i++ ) {
						System.out.printf("%d X %d = %d \n", dan, i, dan*i);
						} 
					System.out.println("-------------------");
					}
				
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}
	}
	
	
	/* count 변수 이용하기 */
	
	// 1 2 3
	// 4 5 6 
	// 7 8 9
	
	public void ex12() {
		
		int count = 0; // 안쪽 for문이 반복할 때 마다 1씩 카운트
		
		// 1행, 2행, 3행 (1줄, 2줄, 3줄)
		for(int row = 1; row <= 3; row++) {
			
			// 1열, 2열, 3열 
			for (int colum = 1; colum <= 3; colum++) {
				count++;// 열을 방문할 떄 마다 1씩 증가
				System.out.print(count + " ");
			}
			
			System.out.println();
		}
	
	}
	
	// 1 2 3 4
	// 5 6 7 8 
	// 9 10 11 12
	
	public void ex13() {
		
		int count = 0;
		
		// 2중 for문 사용
		
		for(int row = 1; row <= 3; row++) {
			for (int colum = 1; colum <= 4; colum++) {
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		
		// 단일 for문 + if문
		for(int i = 1; i <= 12; i++) {
			System.out.print(i + " ");
			
			if(i % 4 == 0) {
				System.out.println();
			}
		}
	}
	
	// 행/열의 크기를 입력 받아 출력하기 + count
	public void ex14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 : ");
		int row = sc.nextInt();
		
		System.out.print("열 : ");
		int col = sc.nextInt();
		
		int count = 0;
		
		// 초기식, 조건식, 증감식은 상황에 따라서 늘어나거나 작성하지 않을 수 있다!
		
		// for( ; ; ) --> 무한루프(조건문 X -> false안됨 -> 종료 X)
		
		// 초기식 작성 X -> 대신 row, col(입력 받은 값) 사용
		for( ; row >= 1 ; row-- ) { //4 3 2 1(4바퀴)
			
			for(int y = col ; y >= 1; y--) {
				
				System.out.print(++count +" ");
			}
			
			System.out.println();
		}
		
		
	}
	
	
	//1 
	//12
	//123
	//1234
	
	
	public void ex15() { 
		
		for (int row = 1; row <=  4; row++) {
			for(int col =1; col <= row; col++)
			{
				System.out.print(col + " ");
			} System.out.println();
		}
		
		
	}
	
	// 1 2 3 4
	// 1 2 3 
	// 1 2 	
	// 1 
	
	public void ex16() {
		for (int row = 4; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			} System.out.println();
		}
	}
	
	// 4 3 2 1
	// 3 2 1
	// 2 1 
	// 1
	
	public void ex17() {
		for(int row = 4; row >= 1; row--) { //row : 4 3 2 1
			
			for(int col = row; col >= 1 ; col--) {
				System.out.print(col + " ");
			}
				
			System.out.println();
		} 
	}
	
	// 4 
	// 4 3
	// 4 3 2
	// 4 3 2 1
	
	public void ex18() {
		for (int row = 4; row >= 1; row-- ) {
			for(int col = 4; col >= row; col-- ) { 
				System.out.print(col + " ");
			} System.out.println();
		}
	}
	
	
	
}