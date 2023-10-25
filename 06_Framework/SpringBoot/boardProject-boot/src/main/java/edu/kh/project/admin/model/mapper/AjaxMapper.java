package edu.kh.project.admin.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface AjaxMapper {

	/** 회원번호로 이메일 조회
	 * @param memberNo
	 * @return email;
	 */
	String selectMemberNo(int memberNo);

	/** 이메일로 전화번호 조회
	 * @param inputEmail
	 * @return
	 */
	String selectEmail(String inputEmail);

	Member selectMember(int no);

	List<String> selectEmailList(String keyword);

	/** 회원 번호 전체 조회
	 * @return memberList
	 */
	List<Member> selectAll();

	/** 회원 탈퇴여부 변경
	 * @param paramMap
	 * @return
	 */
	int updateFlag(Map<String, Object> paramMap);
	
}
