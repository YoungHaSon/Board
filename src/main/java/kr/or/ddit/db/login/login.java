package kr.or.ddit.db.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.db.board.service.BoardService;
import kr.or.ddit.db.board.service.IboardService;
import kr.or.ddit.db.user.model.UsersVo;
import kr.or.ddit.db.user.service.IuserService;
import kr.or.ddit.db.user.service.UserService;

import org.apache.ibatis.logging.LogException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class login
 */
@WebServlet("/login2")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IuserService userService;
	private IboardService service;
	
	@Override
	public void init() throws ServletException {
		userService = new UserService();
		service = new BoardService();
	}
	
	private static final Logger logger = LoggerFactory
			.getLogger(login.class);
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("boardList", service.boardList());
		request.getRequestDispatcher("/login/login.jsp").forward(request,response);
		logger.debug("service.boardList() : {}",service.boardList());
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_id = request.getParameter("user_id");
		String user_pass = request.getParameter("user_pass");
		
		UsersVo uservo = userService.getUser(user_id);
		logger.debug("uservo {} ", uservo);
		logger.debug("user_id : {}",user_id);
		logger.debug("user_pass : {}",user_pass);
		
		if(uservo!= null &&user_pass.equals(uservo.getUser_pass())){
			
			HttpSession session = request.getSession();
			session.setAttribute("USER_INFO", uservo);
			
			request.setAttribute("boardList", service.boardList());
			RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
			rd.forward(request, response);
		}else{
			request.getRequestDispatcher("/login/login.jsp").forward(request, response);
		}
	}

}
