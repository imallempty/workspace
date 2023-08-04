package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		// if - else if
		if (num > 0 && num % 2 == 0 ) { // 양수 + 짝수
			System.out.println("짝수입니다.");
		} else if (num > 0 && num % 2 != 0) { // 양수 + 홀수
			System.out.println("홀수입니다");
		} else {
			System.out.println("양수만 입력해주세요");
		}
		
		// if 중첩
		if(num > 0) { //양수
			
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다");
			}
			
		} else { // 양수 아님
			System.out.println("양수만 입력해주세요");
		}
		
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum /3;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60.0) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	
		
		
			
		}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		// 강사님 풀이과정
		int day = 0; // 해당하는 달의 마지막 일(날짜)을 저장
					// 단, 1~12월이 아니면 0을 저장
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day = 31; break;
		case 4 : case 6 : case 9 : case 11 : day = 30; break;
		case 2 :day = 28; break;
		}
		
		if(day == 0) { // 1 ~ 12 사이가 입력되지 않았을 때
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		} else { // 1 ~ 12 사이가 입력 되었을 때
			System.out.printf("%d월은 %d일까지 있습니다.", month);
		}
		
		
		// 내 풀이과정
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.printf("%월은 31일까지 있습니다.", month); break;
		case 4 : case 6 : case 9 : case 11 : System.out.println("%d은 30일 까지 있습니다."); break;
		case 2 : System.out.println("2월은 28일까지 있습니다"); break;
		
		default : System.out.printf("%d월은 잘못 입력된 달 입니다.", month);
			
		}

		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		
		double BMI = weight / ( height * height);
		System.out.println("BMI 지수 : " + BMI);
		
		String str;
		
		if(BMI < 18.5 ) {
			str = "저체중";
		} else if (BMI < 23) {
			str = "정상체중";
		} else if (BMI < 25) {
			str = "과체중";
		} else if (BMI < 30) {
			str = "비만";
		} else {
			str = "고도비만";
		}
		
		System.out.println("BMI 지수 : " + BMI);
		System.out.println(str);
		
		
		
		// 내 풀이 
		if(BMI < 18.5 ) {
			System.out.println("저체중");
		} else if (BMI < 23) {
			System.out.println("정상체중");
		} else if (BMI < 25) {
			System.out.println("과체중");
		} else if (BMI < 30) {
			System.err.println("비만");
		} else {
			System.out.println("고도비만");
		}
		
		
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int midTerm = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finalTerm = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int homework = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int attendance  = sc.nextInt();
		
		System.out.println("================= 결과 ===================");
		
		
		
		if(attendance <= 20 * (1 - 0.3)) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]", attendance );
			
		} else  { // 출석을 잘했을때
			double midScore = midTerm * 0.2;
			double finalScore = finalTerm * 0.3;
			double homeworkScore = homework * 0.3;
			double attScore = attendance * 5 * 0.2;
			
			double sum = midScore + finalScore + homeworkScore + attScore;
			
			System.out.println("중간 고사 점수(20) : " + midScore);
			System.out.println("기말 고사 점수(30) : " + finalScore);
			System.out.println("과제 점수(30) : " + homeworkScore);
			System.out.println("출석 점수(20) : " + attScore);
			
			if(sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		}
		
		

		
		
		
		

		
		
		
		
	}
}
