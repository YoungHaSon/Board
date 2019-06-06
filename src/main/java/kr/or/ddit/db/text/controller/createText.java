package kr.or.ddit.db.text.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.db.text.service.ItextService;
import kr.or.ddit.db.text.service.TextService;

/**
 * Servlet implementation class createText
 */
@WebServlet("/createText")
public class createText extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger logger = LoggerFactory
			.getLogger(createText.class);
	
	private ItextService textService;
	
	@Override
	public void init() throws ServletException{
		textService = new TextService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int board_id = (Integer.parseInt(request.getParameter("board_id")));
		
		logger.debug("board_id {}", board_id);
		request.setAttribute("allText", textService.allText(board_id));
		request.getRequestDispatcher("/board/createText.jsp").forward(request, response);
	}
 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
