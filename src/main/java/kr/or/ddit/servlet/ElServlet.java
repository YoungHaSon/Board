package kr.or.ddit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/el")
public class ElServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//${userId} 하면 : request에서 찾고 session에서 찾고 application을 찾음
		//3가지 scope 객체에 같은 이름의 속성명으로 다른 값을 설정
		request.setAttribute("userId", "brown_request");
		request.getSession().setAttribute("userId", "cony_Session");
		getServletContext().setAttribute("userId", "sally_application");
		
		//각 영역의 속성을 출력하기 위해 출력을 담당하는 el.jsp로 forward
		request.getRequestDispatcher("/el/el.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
