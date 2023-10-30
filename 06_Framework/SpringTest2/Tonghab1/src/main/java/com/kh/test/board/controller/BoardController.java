package com.kh.test.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.test.board.model.dto.Board;
import com.kh.test.board.model.service.BoardService;


@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	@GetMapping("selectBoard")
	public String selectBoard(Model model, String inputTitle) {
		
		List<Board> boardList = service.selectBoard(inputTitle);
		
		
		return "searchSucess";
	}


}
