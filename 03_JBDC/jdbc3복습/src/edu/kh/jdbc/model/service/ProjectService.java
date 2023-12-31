package edu.kh.jdbc.model.service;

// static 필드/메서드 호출 시 클래스명(JDBCTemplate) 생략
import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import edu.kh.jdbc.model.dao.ProjectDAO;
import edu.kh.jdbc.model.dto.Member;

public class ProjectService {

	private ProjectDAO dao = new ProjectDAO();
	
	/** 회원 가입 서비스
	 * @param member
	 * @return
	 */
	public int insertMember(Member member) {
		
		// 1. 커넥션 생성
		Connection conn = getConnection();
		
		// 2. DAO 메서드 호출(Connection, 매개 변수 전달)
		int result = dao.insertMember(conn, member);
		
		// 3. 트랜잭션 제어
		if(result > 0) commit(conn);
		else rollback(conn);
		
		// 4. 커넥션 반환
		close(conn);
		
		// 5. 결과를 view로 반환
		return result;
		
		
		
	
	}

	/** 로그인
	 * @param email
	 * @param pw
	 * @return
	 */
	public Member login(String email, String pw) {
		
		// 1. 커넥션 생성
		Connection conn = getConnection();
		
		// 2. DAO 메서드 호출
//		Member member = dao.login(conn, email, pw); // PreparedStatement
		Member member = dao.login2(conn, email, pw); // Statement
		
		
		// SELECT는 트랜잭션 제어 처리가 필요 없음 -> 건너 뜀
		
		// 3. 커넥션 반환
		close(conn);
		
		// 4. view 결과 반환
		return member;
	}

	// MEMBER 테이블 전체 조회
	public List<Member> selectAllMember(int sort){
		
		Connection conn = getConnection();
		List<Member> memberList = dao.selectAllMember(conn, sort);
		
		close(conn);
		
		return memberList;
		
		
	}

	/** 회원 정보 수정
	 * @param nickname
	 * @param tel
	 * @param memberNo
	 * @return
	 */
	public int updateMember(String nickname, String tel, int memberNo) {
		
		Connection conn = getConnection();
		
		int result = dao.updateMember(conn, nickname, tel, memberNo);
		
		if(result > 0) 	commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
		
	
	}

	/** 회원 탈퇴
	 * @param memberNo
	 * @param pw
	 * @return
	 */
	public int updateDelFl(int memberNo, String pw) {
		Connection conn = getConnection();
		
		int result = dao.updateDelFl(conn, memberNo, pw);
		
		if(result > 0 ) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;		
	}

	/** 게시글 작성
	 * @param title
	 * @param content
	 * @param memberNo
	 * @return
	 */
	public int insertBoard(String title, String content, int memberNo) {
	
		Connection conn = getConnection();
		
		int result = dao.insertMember(conn, title, content, memberNo);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
		
		
		
	}




}
