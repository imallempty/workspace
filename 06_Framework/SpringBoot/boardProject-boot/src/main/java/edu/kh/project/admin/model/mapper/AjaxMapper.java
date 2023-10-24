package edu.kh.project.admin.model.mapper;

import java.util.List;

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
	
}
