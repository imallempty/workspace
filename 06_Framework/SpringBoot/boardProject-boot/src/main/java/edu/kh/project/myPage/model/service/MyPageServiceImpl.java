package edu.kh.project.myPage.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.project.member.model.dto.Member;
import edu.kh.project.myPage.model.mapper.MyPageMapper;

@Transactional
@Service
public class MyPageServiceImpl implements MyPageService {

	@Autowired
	private MyPageMapper mapper;

	@Autowired
	private BCryptPasswordEncoder bcrypt;

	@Override
	public int info(Member updateMember, String[] memberAddress) {

		// 주소 가공
		// 주소가 입력되지 않은 경우
		if (updateMember.getMemberAddress().equals(",,")) {
			updateMember.setMemberAddress(null);
		} else { // 주소를 입력한 경우
			// 배열 -> 문자열로 합쳐서 inputMember에 추가
			String address = String.join("^^^", memberAddress);
			updateMember.setMemberAddress(address);
		}
		
		// mapper 호출 후 결과 반환
		return mapper.info(updateMember);
	}
	
	
	@Override
	public int chagePw(String currentPw, String newPw, int memberNo) {
		
		String encPw = mapper.selectMemberPw(memberNo);
		
		if(!bcrypt.matches(currentPw, encPw)) {
			return 0;
		}		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("newPw", bcrypt.encode(newPw));
		map.put("memberNo", memberNo);
		
		
		return mapper.changePw(map);
	}
	
	@Override
	public int secession(String memberPw, int memberNo) {

		String encPw = mapper.selectMemberPw(memberNo);
		
		if(!bcrypt.matches(memberPw, encPw)) {
			return 0;
		}
		
		return mapper.secession(memberNo);
	}
	
	
}
