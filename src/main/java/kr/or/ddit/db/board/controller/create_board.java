package kr.or.ddit.db.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.db.board.model.BoardVo;
import kr.or.ddit.db.board.service.BoardService;
import kr.or.ddit.db.board.service.IboardService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class create_board
 */
@WebServlet("/create_board")
public class create_board extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private static final Logger logger = LoggerFactory
			.getLogger(create_board.class);
	
	private IboardService service;

	@Override
	public void init() throws ServletException {
		service = new BoardService();
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("boardAllList", service.boardAllList());
		request.setAttribute("boardList", service.boardList());
		request.getRequestDispatcher("/board/createBoard.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String board_id = request.getParameter("board_id");
		String user_id = request.getParameter("userId");
		String board_name = request.getParameter("boardName");
		String use_yn = request.getParameter("useYN");
		
		int board = Integer.parseInt(board_id);
		
		if(board_id != null){
			BoardVo boardVo = new BoardVo(board,board_name,use_yn);
			service.updateBoardYN(boardVo);
			request.setAttribute("boardList", boardVo);
			response.sendRedirect(request.getContextPath() + "/create_board");
			logger.debug("boardVo : {}",boardVo);
			logger.debug("boardName : {}",board_name);
			logger.debug("use_yn : {}",use_yn);
			logger.debug("board_id : {}",board_id);
		}else{
			BoardVo boardVo = new BoardVo(user_id,board_name,use_yn);
			service.insertBoard(boardVo);
			request.setAttribute("boardList", boardVo);
			response.sendRedirect(request.getContextPath() + "/create_board");
			logger.debug("boardVo : {}",boardVo);
			logger.debug("boardName : {}",board_name);
			logger.debug("user_id : {}",user_id);
			logger.debug("use_yn : {}",use_yn);
		}
	}

}
