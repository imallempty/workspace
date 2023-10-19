package edu.kh.project.admin.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import edu.kh.project.admin.model.mapper.AdminMapper;
import edu.kh.project.member.model.dto.Member;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper mapper;
	
	@Autowired // 암호화 객체 의존성 주입
	private BCryptPasswordEncoder bcrypt;

	@Override
	public Member selectMember(String inputEmail) {
		return mapper.selectMember(inputEmail);
	}

	@Override
	public List<Member> selctAll() {
		return mapper.selectAll();
	}
	
	@Override
	public List<Member> selectSort(int sort) {
		
		// sort 값에 따라 가공 처리
		String query = null;
		
		switch(sort) {
		case 1: query = "MEMBER_NO DESC"; break;
		case 2: query = "MEMBER_NO"; break;
		case 3: query = "MEMBER_EMAIL DESC"; break;
		case 4: query = "MEMBER_EMAIL"; break;
		}
		
		return mapper.selectSort(query);
	}
	
	@Override
	public int restoration(int memberNo) {
		return mapper.restoration(memberNo);
	}
	
	@Override
	public int changeAuthority(int memberNo) {
		return mapper.changeAuthority(memberNo);
	}
	
	@Override
	public int initPw(int memberNo) {

		String ecnPw = bcrypt.encode("1234");
		
		// 마이파티스 코드에서 파라미터는 1개만 가능!!
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("encPw", ecnPw);
		map.put("memberNo", memberNo);
		
		return mapper.initPw(map);
	}

}