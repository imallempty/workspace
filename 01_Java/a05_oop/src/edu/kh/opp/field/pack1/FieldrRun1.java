package edu.kh.opp.field.pack1;

public class FieldrRun1 {
	
	public static void main(String[] args) {
		
		// FieldTest1 객체 생성
		FieldTest1 f1 = new FieldTest1();
		
		System.out.println(f1.v1); // public : 어디서든
		System.out.println(f1.v2); // protected : 같은 패키지 + 상속
		System.out.println(f1.v3); // (default) :  같은 패키지

		//		System.out.println(f1.v4); // private :  같은 클래스
		// -> 다른 클래스라 오류 발생
		
		f1.method1();
		
	}

}
