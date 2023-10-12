package edu.kh.project.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.member.model.dto.Member;

@Repository // Bean으로 등록 + 저장소(DB, 파일 등) 연결하는 역할)
public class MemberDAOImpl implements MemberDAO{

	// SqlSessionTemplate Bean 의존성 주입 받기
	// (마이바티스 사용 + DB 연결 정보 + 트랜잭션 자동 제어)
	// -> root-context.xml에 Bean 등록 구문이 작성되어 있음
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public Member login(Member inputMember) {
		
		// sqlSession.selectOne("namespace.id"[, 파라미터]);
		
		// - selectOne() : 1행 조회
		// - "namespace.id" : mybatis-config.xml에 등록된 mapper 파일 중 namespace와 태그 id가 일치하는 SQL 수행
		// - 파라미터 : SQL에서 사용 시 필요한 값 전달
		
		
		return sqlSession.selectOne("memberMapper.login", inputMember);
	}
	
	@Override
	public int signup(Member inputMember) {
		
		// (반환형)
		// int sqlSession.insert("namespace.id [, 파라미터])
		
		// - insert(), update(), delete() 메서드의 결과는 성공한 행의 개수(int 타입) 반환
		
		return sqlSession.insert("memberMapper.signup", inputMember);
		// -> mybatis-config.xml에 등록된 mapper 파일 중 namespace가 "memberMapper"인 파일 내에서
		// id가 "signup"인 SQL 태그(insert)를 수행
		// 이때, 파라미터로 inputMember를 전달
		// SQL 수행 완료 후 insert 결과 행의 개수를 반환 받음
	}

}
