package edu.kh.project.myPage.model.dao;

import java.util.Map;

import edu.kh.project.member.model.dto.Member;

//interface 사용 이유 : 규치성 부여, 결합도 약화

public interface MyPageDAO {

	int info(Member updateMember);

	/** 회원 비밀번호 조회
	 * @param memberNo
	 * @return encPw
	 */
	String selectMemberPw(int memberNo);

	/** 비밀번호 변경
	 * @param map
	 * @return result
	 */
	int changePw(Map<String, Object> map);

	/** 회원 탈퇴
	 * @param memberNo
	 * @return
	 */
	int secession(int memberNo);


}
