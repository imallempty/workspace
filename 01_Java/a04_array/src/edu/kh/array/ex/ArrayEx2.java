package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayEx2 {
	
	/* 변수 : 값을 저장하기 위한 메모리 공간
	 * 
	 * 1차원 배열 : 같은 자료형의 변수를 묶음으로 다루는 것
	 * 
	 * 2차원 배열 : 같은 자료형의 1차원 배열을 묶음으로 다루는 것
	 * 
	 * 참조 변수 -> 1차원 배열 참조변수 묶음(배열)
	 * 
	 * 2차원 배열 참조 변수
	 * 			-> 1차원 배열 참조 변수 묶음 (배열)
	 * 				-> 각 참조 변수는 1차원 배열을 참조
	 */

	public void ex1() {
		// 2차원 배열 선언, 할당
		
		int[][] arr = new int[2][3]; // 2행 3열
		
		// 인덱스를 이용한 초기화
		arr[0][0] = 7;
		arr[0][1] =14;
		arr[0][2] = 21;
		
		arr[1][0] = 28;
		arr[1][1] = 35;
		arr[1][2] = 42;
		
		
		
		// 2중 for문을 이용해서
		// 배열의 모든 요서에 접근하여 출력하기
		
		// row < 2 == row < arr.length 
		// -> 2차원 배열에서 배열명.length == 행의 개수
		
		// 행 제어
		for(int row = 0; row < arr.length; row++ ) {
			
			// col < 3 == col < arr[row].length
			// -> row번째 행이 참조하는 1차원 배열의 길이
			// == 각 행의 열의 개수
			
			// 열 제어
			for(int col = 0; col < arr[row].length; col++ ) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		// 배열 참조변수.length
		// -> 참조하고 있는 배열의 길이를 반환
				
		// arr == 1차원배열 참조 변수의 묶음(배열)을 참조하는 변수
		// arr.length == 2
		
		// arr[0] == 1차원 배열 참조 변수
		// arr[0].length == 3
		
		// arr[1] == 1차원 배열 참조 변수
		// arr[1].length == 3
		
	}
	
	// 2차원 배열 선언과 동시에 초기화
	public void ex2() {
		
		char[][] arr = { {'a','s','d'}, 
						 {'z','x','c'}, 
						 {'f', 'g','h'} };
		
		// 입력 받은 알파벳의 위치를 검색하는 프로그램
		
		// 1. char 입력 받기
		Scanner sc = new Scanner(System.in);
		
//		String input = sc.next(); // 문자열 (단어) 입력 받기
		
		// sc.nextChar()는 존재하지 않으므로
		// sc.next()를 이용해 문자열을 입력 받은 후
		// String.charAt(index)를 이용해 0번 인덱스 값을 반환 받기
		
		System.out.print("검색할 알파벳을 입력해주세요 : ");
		char input = sc.next().charAt(0);
		// -> 입력된 알파벳(char) input에 대입
		
		// 2차원 배열을 참조하는 arr을 이용해서 
		// 2차원 배열의 모든 요소를 접근하는 2중 for문 작성
		
		// 신호 용도의 변수 flag
		// true : 검색 결과 없음
		// false : 검색 결과 존재함
		boolean flag = true;
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				
				// 현재 접근한 2차원 배열의 요소의 값이
				// 입력받은 input과 같은지 확인
				if(arr[row][col] == input ) {
					
					// %c :char
					System.out.printf("%c는 %d행 %d열에 있습니다.", arr[row][col], row,col);
					flag = false; //flag 변경
				}
			}
		}
		// 2중 for문(검색) 코드가 끝난 후 flag의 상태를 검사
					if(flag) { // flag가 true일 때 if 실행
							   // false 일 때 if 실행 안함
					System.out.println("검색 결과가 없습니다.");
						
					}
		
		
	}
	
	public void ex3() {
		
		int[][] arr = {
						{30, 56, 13, 27},
						{50, 70, 80, 90},
						{104, 20, 12, 86}
					   };
		
		// 2차원 배열에 저장된 모든 요소의 합/평균을 출력
		// 힌트. sum, 2중 for문을 이요한 2차원 배열요소 모두 접근
		
		int sum = 0;
		
		
//		for(int row = 0; row < arr.length; row++) {
//			for(int col = 0; col < arr[row].length; col++) {
//				sum += arr[row][col];
//				
//			}
//		}
		
		// 향상된 for문 : 모든 배열 요소를 접근하는 용도의 for문
		// 장점 : 작성이 간단함
		// 단점 : 시작, 끝, 증감 ,인덱스 지정 불가능
		
		// for( 배열요소의 자료형으로 된 변수 : 배열명)
		// 		-> 오른쪽에 작성한 배열의 요소를
		// 			순서대로 하나씩 꺼내와 대입
		
		for(int[] row : arr) {
			for(int col : row) {
				sum += col;
			}
		}
		
		System.out.print("합 : " + sum + "\n");
		System.out.print("평균 : " + sum/(arr.length * arr[0].length));
		
	}
	
	public void ex4() {
		
		// 4행 4열짜리 정수형 2차원 배열을 생성한후
		// 각 배열 요소에 1 ~ 100 사이 난수를 대입
		// 2차원 배열에 저장된 값을 모두 출력
		// 모든 요소의 합
		// 최대값, 최소값 출력
		
		int[][] arr = new int[4][4];
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col< arr[row].length; col++) {
				int random = (int)(Math.random() * 100 + 1);
				arr[row][col] = random;
				
			}
		}
		
		// 최대, 최소 찾기 == 비교 == 비교값이 존재해야함
		// -> 이럴때는 비교군의 첫 번째 값을 이요
		int max = arr[0][0]; // 최대값 저장용 변수
		int min = arr[0][0];; // 최소값 저장용 변수
		int sum = 0;
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				
				// %d : 정수
				// %4d : 정수가 출력될 공간 4칸을 만들고 오른쪽 정렬해서 출력
				System.out.printf("%4d", arr[row][col]);
				
				sum += arr[row][col]; // 합계 누적
				
				// 최대값 구하기
				if(arr[row][col] < max) { // 현재 요소의 값이 더 크면
					max = arr[row][col]; // max에 현재 요소 값을 대입
				}
				
				if(arr[row][col] > min) { // 현재 요소의 값이 더 작으면
					min = arr[row][col]; // min에 현재 요소 값을 대입
				}
			}
			System.out.println();
		}
		System.out.println("합계 : " + sum);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	
	
	
	
	
	
	
}
