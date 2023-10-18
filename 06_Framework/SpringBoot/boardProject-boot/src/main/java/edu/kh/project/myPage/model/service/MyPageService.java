package edu.kh.project.myPage.model.service;

import edu.kh.project.member.model.dto.Member;

public interface MyPageService {

	/** 회원 정보 수정
	 * @param updateMember
	 * @param memberAddress
	 * @return result
	 */
	int info(Member updateMember, String[] memberAddress);

	/** 비밀번호 변경
	 * @param currentPw
	 * @param newPw
	 * @param memberNo
	 * @return  result
	 */
	int chagePw(String currentPw, String newPw, int memberNo);

	/** 회원 탈퇴
	 * @param memberPw
	 * @param memberNo
	 * @return
	 */
	int secession(String memberPw, int memberNo);

	

}
