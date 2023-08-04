package edu.kh.opp.cls.pack2;

// ClassTest1 클래스를 가져오는 코드
import edu.kh.opp.cls.pack1.ClassTest1;

public class TestRun2 {
	public static void main(String[] args) {
		
		// ClassTest1 객체 생성
		// -> 다른 패키지에 존재
		// -> public은 어디서든 접근 가능하다고 했는데... 왜 안되는거지?
		// --> 패키지가 다른 클래스를 접근하고자 할 때 
		// import라는 작업을 해서 가져와 사용
		
		// -> public은 어디서든 접근해서 가져가서 사용 가능하는 의미
		ClassTest1 c1 = new ClassTest1();
		
		c1.method1();
		
		// ClassTest2 객체 생성
		ClassTest2 c2 = new ClassTest2();
		// (default) 접근 제한자 :  같은 패키지 내에서 접근 가능 (확인완료)
		// + 같은 패키지는 import 필요 없음
		c2.method2();
	}

}
