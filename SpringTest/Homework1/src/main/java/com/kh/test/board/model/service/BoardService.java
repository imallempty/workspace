package com.kh.test.board.model.service;

import java.util.List;

import com.kh.test.board.model.dto.Board;

public interface BoardService {

	
	/** 게시글 목록 조회
	 * @return boardList
	 */
	List<Board> selectBoardList();

	/** 게시글 상세조회(게시글 번호 이용)
	 * @param no
	 * @return 
	 */
	Board selectOne(int no);

	/** 게시글 작성(해당 문제에서는 실패하는 경우가 없음)
	 * @param board
	 * @return
	 */
	int insert(Board board);

	/** 비밀번호 일치 시 삭제
	 * @param boardPw
	 * @param boardNo
	 * @return
	 */
	int deleteBoard(String boardPw, int boardNo);

	/** 비밀번호 일치 시 수정 화면으로 전환
	 * @param boardPw
	 * @param boardNo
	 * @return
	 */
	Board moveUpdate(String boardPw, int boardNo);

	/** 게시글 수정
	 * @param board
	 * @return
	 */
	int updateBoard(Board board);

}
