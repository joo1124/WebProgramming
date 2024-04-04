package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public loginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		String uname1 = request.getParameter("name1");
		String uname2 = request.getParameter("name2");
		String ugrade = request.getParameter("grade");
		String usex = request.getParameter("sex");
		String[] usubject = request.getParameterValues("subject");
		String res = "<html><h3>정보 확인 " + "<br>" + 
		"이름 : "+ uname1 + "<br>" +
		"별명 : " + uname2 + "<br>" +
		"학년 : " + ugrade + "학년 <br>" +
		"성별 : " + usex + "<br>"+
		"과목 : ";
		for(int i=0; i<usubject.length; i++)
		res += usubject[i] +", ";
		
		res+="</h3></html>";
		response.getWriter().print(res);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
