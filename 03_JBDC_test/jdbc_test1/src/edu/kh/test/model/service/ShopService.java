package edu.kh.test.model.service;

import static edu.kh.test.common.JDBCTemplate.*;

import java.sql.Connection;

import edu.kh.test.model.dao.ShopDAO;
import edu.kh.test.model.dto.ShopMember;

public class ShopService {

	private ShopDAO dao = new ShopDAO();

	public ShopMember ShopMember(String memberId) {
		
		
		Connection conn = null;
		
		ShopMember ShopMember = dao.selectMember(conn,memberId);
		
		
		return null;
	}

	
	 
	
	
	
}
