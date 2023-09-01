package edu.kh.jdbc.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.jdbc.model.dto.Member;
import edu.kh.jdbc.model.service.MemberService;

public class MemberView {
	
	// 필드 
	private Scanner sc = new Scanner(System.in);
	private MemberService service = new MemberService();
	
	/** 메뉴 출력용 메서드*/
	public void displayMenu() {
		
		int input = -1;
		
		do {
			try {
				System.out.println("\n--- Member 테이블로 JDBC 연습하기 ---\n");
				System.out.println("1. 회원 가입(INSERT)");
				
				System.out.println("0. 종료");
				
				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				
				switch(input) {
				case 1 : insertMember(); break;
				
				case 0 : System.out.println("\n프로그램 종료\n"); break;
				default : System.out.println("\n메뉴에 작성된 번호만 입력하세요\n");
					
				}
				
			} catch (InputMismatchException e) {
				System.out.println("\n[잘못된 입력입니다.]\n");
				sc.nextLine(); // 입력 버퍼에 잘못 입력된 문자열 제거
			}
			
 		} while(input != 0);
		
	}
	
	/** 회원 가입 화면 */
	private void insertMember() {
		System.out.println("\n***** 회원 가입 *****\n");
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		System.out.print("닉네임 : ");
		String nickName = sc.next();
		
		System.out.print("휴대폰 번호(- 제외) : ");
		String tel = sc.next();
		sc.nextLine(); // 입력 버퍼 개행문자 제거
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		// 입력 받은 값을 Member 객체에 저장하기
		Member member = new Member(email, pw, nickName, tel, address);
		
		// 서비스로 member를 전달한 후 수행 결과 반환 받기
		// -> DML(INSERT, UPDATE, DELETE)결과는 수행한 행의 수(int)로 반환
		int result = service.insertMember(member); // 1 또는 0
		
		if(result > 0) {
			System.out.println("회원 가입 성공!!");
		} else {
			System.out.println("회원 가입 실패....");
		}
	}

}
