package edu.kh.jdbc.model.service;

import java.sql.Connection;

import edu.kh.jdbc.common.JDBCTemplate;
import edu.kh.jdbc.model.dao.MemberDAO;
import edu.kh.jdbc.model.dto.Member;

// Service : 비즈니스 로직
// - 요청에 따른 필요 데이터를 반환
// + DB 연결 코드인 DAO를 호출
// + 트랜잭션 제어(commit, rollback)
// --> commit, rollback을 하려면 Connection이 필요하기 때문에
// 	   Service에서 Connection을 생성/닫기
public class MemberService {
	
	// 필드
	private MemberDAO dao = new MemberDAO();

	/** 회원 가입 서비스
	 * @param member
	 * @return
	 */
	public int insertMember(Member member) {
		
		// 1. 커넥션 생성(JDBCTemplate 이용)
		Connection conn = JDBCTemplate.getConnection();
		
		// 2. DAO 메서드 호출(커넥션, 매개변수 전달)
		// -> insert 성공한 행의 개수 반환
		int result = dao.insertMember(conn, member);
		
		// 3. 성공 여부에 다른 트랜젝션 제어
		if(result > 0) JDBCTemplate.commit(conn); // insert 성공
		else JDBCTemplate.rollback(conn); // insert 실패
		
		// 4. 사용 완료된 커넥션 반환(close)
		JDBCTemplate.close(conn);
		
		// 5. SQL 수행 결과를 view 반환
		return result;
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
