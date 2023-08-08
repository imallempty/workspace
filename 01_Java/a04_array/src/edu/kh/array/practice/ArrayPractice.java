package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i <= arr.length; i++) {
			System.out.printf("%d ",i);
			
				if( i % 2 == 0) {
					sum += i;
				
			}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		}}
	
	public void practice2() {
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i = 9; i >=1; i-- ) {
			System.out.printf("%d ",i);
			
			if( i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 1; i <= arr.length; i++) {
			System.out.printf("%d ",i);
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			arr[i] = input; 
	
		}
		
		System.out.print("검색할 값 : ");
		int num  = sc.nextInt();
		
		boolean flag = true;
		
		for(int i = 0; i < 5; i++) {
			if(arr[i] == num) {
				System.out.printf("%d",i);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	
	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input1 = sc.next();
		
		System.out.print("문자 : ");
		char input2 = sc.next().charAt(0);
		
		char[] arr = new char[input1.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input1.charAt(i);
		}
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", input1,input2);
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == input2) {
				System.out.printf("%d ", i);
				count++;
			}
		}
		System.out.println();
		System.out.printf("%s의 개수 : %d", input2, count);

	}
	
	
	public void practice6() {
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("정수 : ");
	      int input  = sc.nextInt();
	      
	      int[] arr = new int[input];
	      
	      for(int index = 0; index < arr.length; index++) {
	         System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", index);
	         arr[index] = sc.nextInt();
	         }
	      
	      int sum = 0;
	      
	      for(int index = 0; index < arr.length; index++) {
	         System.out.printf("%d ", arr[index]);
	         sum += arr[index];
	         }
	      System.out.println();
	      System.out.println("총합 : " + sum);
	      
	      
	   }
	
	
	public void practice7() {
//		주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
//		단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
				arr[i] = input.charAt(i) ;
			} 
		
		
		
		}
		
		
	
	
	
	public void practice8() {
	      
	      Scanner sc = new Scanner(System.in);
	      
	      while(true) {
	         
	         System.out.print("정수 : ");
	         int input = sc.nextInt();
	         
	         int[] arr = new int[input];
	         
	         if(input % 2 == 0 || input < 3) {
	            System.out.println("다시 입력하세요");
	         }
	         
	         for(int num1 = 0; num1 < (arr.length + 1)/2; num1++) {
	            arr[num1] = num1 + 1; 
	            System.out.print(arr[num1]);
	         } 
	         
	       
	      }
	         
	      }
	
	
	public void practice9() {
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			
			System.out.printf("%d ", arr[i]);
		
		}
		
	}
	
	
	public void practice10() {
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			
			System.out.printf("%d ", arr[i]);
		
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] <min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice11() {
		// 1~10 사이의 난수를 발생시켜 중복된 값이 없게 
		
			int[] arr = new int[10];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = (int)(Math.random() * 10 + 1 );
				
				boolean flag = false;
				for(int x = 0; x <i; x++) {
					if(arr[x] == arr[i]) {
					i--;
					flag = true;
					break;
					}
				}
				
			}
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		// 당첨 번호 개수
		int[] arr = new int[6];
		
		// 로또 번호 1 ~ 45 까지
		
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 45 + 1);
			arr[i] = random;
			
			// 중복된 숫자 확인
			boolean flag = false;
			
			for(int x = 0; x <arr.length; x++) {
				if(arr[x] == arr[i]) {
				flag = true;
				break;
				}
			}
		}
		// 오름차순은 못함
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice13() {
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		문자의 개수와 함께 출력하세요. (중복 제거)
//		
//		문자열 : application
//		문자열에 있는 문자 : a, p, l, i, c, t, o, n
//		문자 개수 : 8
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		
		char[] arr = new char[input.length()];

		System.out.print("문자열에 있는 문자 : ");;
	}
	
	public void practice14() {
		
//		사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당하고
//		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int input1  = sc.nextInt();
		
		String[] arr = new String[input1];
		

	
		
		

	}
	
	
	public void practice15() {
		
		String[][] arr = new String[3][3];
			

		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				arr[row][col] = "(" + row + ", " + col + ")";
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
	}
	
	
	
	public void practice16() {
		
		int[][] arr = new int[4][4];
		
		int count = 0;
		
		for(int row = 0; row < arr.length; row++ ) {
			for(int col = 0; col <arr[row].length; col++) {
				arr[row][col] = count;
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
			
		}
	}
	
	
	
	public void practice17() {
		
		int[][] arr = new int[4][4];
		
		int count = 17;
		
		for(int row = 0; row < arr.length; row++ ) {
			for(int col = 0; col <arr[row].length; col++) {
				arr[row][col] = count;
				count--;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}
	
	
	public void practice18() {
		
		int[][] arr  = new int[4][4];
		
		
	}
	
	
	
	public void practice19() {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		
		while(flag = true) {
		System.out.print("행 크기 : ");
		int input1 = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int input2 = sc.nextInt();
		
		if(input1 < 1 || input1 > 10 || input1 < 1 || input1 > 10) {
			System.out.println("반드시 1 ~ 10사이의 정수를 입력해야 합니다.");
		} else {
			flag = true;
			}
		char[][] arr = new char[input1][input2];
		
		for(int row = 0; row < arr.length; row++ ) {
			for(int col = 0; col < arr[row].length; col++) {
				int random = (int)(Math.random() * 10 + 65);
				arr[row][col] = (char)random;
				System.out.print(arr[row][col] + " ");
			}
	
			System.out.println();
		}
		break;
		
		}
		
		}
		
		
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
		System.out.printf("%d열의 크기 : ", i);
		int num = sc.nextInt();
		}
		
		
	}
		
	
	public void practice21() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
