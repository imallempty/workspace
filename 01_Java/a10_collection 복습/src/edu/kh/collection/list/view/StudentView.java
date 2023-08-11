package edu.kh.collection.list.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.list.model.service.StudentService;

public class StudentView {
	
	// 필드
	private Scanner sc = new Scanner(System.in);
	StudentService service = new StudentService();
	
	public void displayMenu() {
		
		int input = 0; // while 문을 끝낼수 있는 조건 생성하기
		
		do {
			
			try {
				
				System.out.println("***** 학생 관리 프로그램 *****\n");
				
				System.out.println("1. 학생추가");
				System.out.println("2. 학생 전체 조회");
				System.out.println("3. 학생 1명 조회(index)");
				System.out.println("4. 학생 1명 삭제(index)");
				System.out.println("5. 성별 조회");
				System.out.println("6. 같은 학년 조회");
				System.out.println("7. 이름으로 조회");
				System.out.println("8. 중복확인");
				System.out.println("9. 성적 순서로 조회하기");
				
				System.out.println("0. 프로그램 종료");
				
				System.out.print("메뉴를 선택 >> ");
				input = sc.nextInt(); // InputMismatchException 발생 가능성 있음
				
				switch(input ) {
				case 1 : addStudent() ;         break;
				
				case 0 : System.out.println("<프로그램 종료>"); break;
				
				default : System.out.println("* 잘못 입력 *");
				
			
				}
			}catch(InputMismatchException e) {
				System.out.println("* 메뉴 번호만 입력해주세요 * ");
				input = -1;
				sc.nextLine();
			}
			
		} while(input != 0);

		}

	private void addStudent() {
		
System.out.println("\n----- 학생 추가 -----");
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int ban = sc.nextInt();
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
