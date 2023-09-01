package edu.kh.jdbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import edu.kh.jdbc.common.JDBCTemplate;
import edu.kh.jdbc.model.dto.Member;

// DAO(Data(Database) Access Object) : 데이터베이스 접근 객체
// - JDBC를 이용해서 DB에 SQL을 전달하여 수행후 결과를 반환 받는 역할
public class MemberDAO {

	// 필드
	// JDBC 객체 참조 변수 선언(Connection은 Service에서 생성 -> 제외)
	private Statement stmt = null;
	private ResultSet rs = null;
	
	// PreparedStatement(준비된 Statement)
	// - 외부 변수 값을 SQL에 받아드릴(삽입할) 준비가 되어있는 Statement
	// -> 성능, 속도면에서 우위를 가지고 있음
	
	// - ?(placeholder) : 변수를 위치시킬 자리를 지정
	private PreparedStatement pstmt = null;
	
	
	/** 회원가입
	 * @param conn
	 * @param member
	 * @return
	 */
	public int insertMember(Connection conn, Member member) {
		
		// 1. JDBC 객체 참조 변수 선언 -> 필드에 작성 완료
	    // 2. DriverManager를 이용해 Connection 객체 생성
	    //      -> Service에서 만들어서 전달 받음
		// -----------------------------------------
		// DAO 작성법
		// 1. 최종결과를 저장할 변수 선언 또는 객체 생성
		int result = 0;
		
		// 2. SQL 작성
		
		// 1) Statement를 이용해서 수행할 SQL 작성법 -> 작성이 어려움
		//		--> Statement의 자식인 PreparedStatement 사용 
//		String sql = "INSERT INTO MEMBER\r\n"
//				+ "VALUES(SEQ_MEMBER_NO.NEXTVAL, \r\n"
//				+ "	'"+member.getMemberEmail()+"', \r\n"
//				+ "	'"+member.getMemberPw()+"',\r\n"
//				+ "	'"+member.getMemberNickname()+"',\r\n"
//				+ "	'"+member.getMemberTel()+"',\r\n"
//				+ "	'member.getMemberAddress()', \r\n"
//				+ "	DEFAULT, DEFAULT)";
		
		// 2) PreparedStatement용 SQL 작성
		String sql = "INSERT INTO MEMBER "
				+ "VALUES(SEQ_MEMBER_NO.NEXTVAL, ?, ?, ?, ?, ?,DEFAULT, DEFAULT)";
		
		try {
			// 3) PreparedStatement 객체 생성
			// Statement와 다르게 생성시 sql을 매개변수로 사용함
			// -> SQL을 생성할 떄 전달하여 ?에 값 대입을 준비함
			pstmt = conn.prepareStatement(sql);
			
			// 4. ?(placeholder)에 알맞은 값 대입
			// pstmt.set자료형(순서, 값);
			
			// ** pstmt.setString()으로 문자열을 SQL에 대입하면
			// 자동으로 양쪽에 ''을 추가해준다
			pstmt.setString(1,member.getMemberEmail());
			pstmt.setString(2,member.getMemberPw());
			pstmt.setString(3,member.getMemberNickname());
			pstmt.setString(4,member.getMemberTel());
			pstmt.setString(5,member.getMemberAddress());
			
			// 5. SQL 수행(INSERT) 후 결과 반환(결과 행의 수) 받기
			result = pstmt.executeUpdate(); 
			// 매개변수에 SQL 추가 X
			// 왜? 이미 pstmt 생성할 때 추가했기 때문에
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			// 6. 사용한 JDBC 객체 자원 반환
			// (PreparedStatement는 Statement의 자식이다)
			JDBCTemplate.close(pstmt);
		}
		return 0;
	}

}
