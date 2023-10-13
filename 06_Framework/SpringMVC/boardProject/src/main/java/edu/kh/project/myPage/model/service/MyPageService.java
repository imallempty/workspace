package edu.kh.project.myPage.model.service;

import edu.kh.project.member.model.dto.Member;

// interface 사용 이유 : 규치성 부여, 결합도 약화

public interface MyPageService {

	/** 내 정보 수정 서비스
	 * @param updateMember
	 * @param memberAddress
	 * @return result(1: 성공, 0: 실패)
	 */
	int info(Member updateMember, String[] memberAddress);

	/** 비밀번호 변경 서비스 
	 * @param currentPw
	 * @param newPw
	 * @param memberNo
	 * @return result(1 :성공, 0: 실패)
	 */
	int changePw(String currentPw, String newPw, int memberNo);

	/** 회원 탈퇴 서비스
	 * @param memberPw
	 * @param memberNo
	 * @return result(1 :성공, 0: 실패)
	 */
	int secession(String memberPw, int memberNo);
	
}
