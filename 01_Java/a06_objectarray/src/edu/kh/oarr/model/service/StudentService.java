package edu.kh.oarr.model.service;

import java.util.Random;

import edu.kh.oarr.model.dto.Student;

/** 학생 추가 서비스 입니다.*/
public class StudentService {
	
	// 필드
	private Student[] studentArr = new Student[10];
	// 학생 객체 참조 변수 10개의 묶음 Student[]을 할당하고
	// 그 주소를 studentArr에 대입
	
	// studentArr[0], studentArr[1]. student[2]....
	// 각 배열 요소 하나하나는 Student 객체 참조 변수가 된다.
	
	// 기본 생성자
	// 학생 객체 배열에 들어갈 샘플 학생 데이터를 3개 추가
	
	public StudentService() {
		studentArr[0] = new Student(1,2,3,"홍길동");
		studentArr[1] = new Student(2,3,13,"박철수");
		studentArr[2] = new Student(3,7,23,"최미영");
		
		Random random = new Random(); // 랜덤 객체 생성(자바에서 제공)
		
		for(int i = 0; i < studentArr.length; i++) {
			// studentArr[3] 부터 참조하는 학생 객체가 없음
			// studentArr[3] 부터 저장된 값은 null
			// *null : 참조하는 객체가 없음을 뜻하는 값 *
			
			if(studentArr[i] == null) {
				break; // 학생 객체가 없으면 반복문 멈춤
			}
			
			//random.nextInt(101)
			// - 정수형 난수 0이상 101미만의 정수형 난수를 반환
			studentArr[i].setKor(random.nextInt(101));
			studentArr[i].setEng(random.nextInt(101));
			studentArr[i].setMath(random.nextInt(101));
		}
	}
	
	/** 학생 추가 서비스 입니다.*/
	public boolean addStudent(int grade, int ban, int number, String name) {
		
		// 1. studentArr의 요소 중
		// 참조하는게 없는 배열요소를 찾아
		// 그 중 index 번호가 가장 낮은 요소에 학생 객체 주소를 대입
		// true 반환
		for(int i = 0; i < studentArr.length; i++) {
			
			if(studentArr[i] == null) { // 참조하는게 없을 경우
				// 학생 객체를 생성하여 주소를 대입
				studentArr[i] = new Student(grade, ban, number, name);
				
				// return : 현재 메서드를 즉시 멈추고 호출한 곳으로 돌아감
				return true;
			}
		}
		
		// 2. studentArr의 요소 중
		// 참조하는게 없는 배열 요소가 없을 경우 (꽉찬 경우)
		// false를 반환
		return false;
	}
	
	/** 학생 전체 조회 서비스*/
	public Student[] selectAll() {
		return studentArr;
	}
	
	/** 학생 1명 정보 조회(인덱스) 서비스 */
	public Student selectIndex(int index) {
		
		// index가 배열 범위를 초과 하거나
		// studentArr[index] 요소가 저장한 값이 null인 경우
		// null 반환
		if( index < 0   || 
			index >= studentArr.length   || 
			studentArr[index] == null) {
			return null;
		}
		
		// index번째 요소에 학생 객체를 참조하는 주소가 있는 경우
		// 그 주소를 반환
		return studentArr[index];
	}

	
	/** 학생 1명 점수 조회(점수, 합계, 평균) 서비스*/
	public String selectScore(int index) {
		
		if(	index < 0   ||  index >= studentArr.length   ||
			studentArr[index] == null) {
			return "해당 인덱스에 학생 정보가 존재하지 않습니다.";
		}
		
		// studentArr[index] 쓰기 기니까 짧은 이름의 변수에 주소만 복사
		Student s = studentArr[index];
		int sum = s.getKor() + s.getEng() + s.getMath(); // 합계
		
		return String.format(
			"[%s] 국어:%d, 영어:%d, 수학:%d, 합계:%d, 평균:%.1f", 
			s.getName(), s.getKor(), s.getEng(), s.getMath(), sum , sum/3.0);
	}
				 
	
	/** 학생 정보 수정 서비스*/
	public void updateStudent(Student s, int kor, int eng, int math) {
		s.getEng();
		s.getKor();
		s.getKor();
		//return; // 컴파일러가 자동으로 추가 해줌
	}
	
	/** 학생 이름으로 조회*/
	public Student[] selectName(String name) {
		
		// 기본 자료형 || 참조형(주소) || null 비교 시
		// 비교 연산자( ==, != ) 사용
		
		// String || 객체가 가지고 있는 모든 필드 비교 시
		// A.equals(B) 사용
		
		// 1. 반환하려는 Student 객체 배열의 크기를
		// 	  studentArr과 똑같이 만든 후
		// 	  검색한 학생을 차례대로 배열에 추가 후 반환
		// 	  -> for문으로 출력시 배열 요소가 null인 경우 반복 종료
		
		// 2. 같은 이름의 학생을 studentArr 배열에서 찾아 카운트 한 후
		// 	  카운트한 크기 만큼의 학생 객체 배열을 생성 후
		// 	  같은 이름의 학생을 찾아 생성한 배열에 추가
		
		int count = 0;
		
		// 향상된 for문
		for( Student s : studentArr ) {
			
			// NullPointerException (null을 참조해서 필드, 메서드 접근 시 발생)
			// 방지하기
			
			if(s == null) {
				break;
			}
			
			if(s.getName().equals(name)) {
				// s.getName()과 name의 값이 같을 때
				count++; // count 1씩 증가
			}
		}
		// count == 0 인 경우 (같은 이름의 학생이 없음)
		if(count == 0) {
			return null;
		}
		
		// 검색된 학생을 저장할 배열 생성
		Student[] arr = new Student[count];
		
		int index = 0; // 검색된 학생 객체의 주소를 
					   // arr 배열의 몇 번 인데스 대입해야 되는지를 제어
		
		for(Student s :studentArr) { //NullPointerException 방지
			if(s == null) {//
				break;
			}
			if(s.getName().equals(name)) { // 이름이 일치 학생일 경우
				arr[index] = s;
				index++;
			}
		}
		
		return arr;
	}

	/** 평균 최고점, 최저점 학생 찾기*/
	public Student[] selectMaxMin() {
		
		Student[] arr = new Student[2]; // [0]: 최고점, [1]: 최저점
		
		// 인덱스
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < studentArr.length; i++) { // 더 이상 학생이 없으면 멈춤
			if(studentArr[i] == null) {
				break;
			}
			
			// 최고점의 합
			Student s1 = studentArr[max];
			int maxSum = s1.getKor() + s1.getEng() +s1.getMath();
			
			// 최저점의 합
			Student s2 = studentArr[min];
			int minSum = s2.getKor() + s2.getEng() +s2.getMath();
			
			// 현재 인덱스(i)번째 요소의 합
			Student s3 = studentArr[i];
			int sum = s3.getKor() + s3.getEng() +s3.getMath();
			
			if(sum > maxSum) { // 최대값 보다 큰 경우
				max = i; // 현재 인덱스를 max에 저장
			}
			
			if(sum < minSum) {// 최저점 보다 작은 경우
				min = i; // 현재 인덱스를 min에 저장		
			}
			
		}
		
		arr[0] = studentArr[max];
		arr[1] = studentArr[min];
		
		return arr;
	}
	
	

}
