package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieTest2
 */
@WebServlet("/CookieTest2")
public class CookieTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieTest2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		String ptr = "<br> <a href='CookieTest3'>Another page</a>";
		
		if(cookies == null) {
			String uid = request.getParameter("id");
			String upw = request.getParameter("pw");
			
			Cookie cookie_id = new Cookie("userID", uid);
			Cookie cookie_pw = new Cookie("userPW", upw);
			response.addCookie(cookie_id);
			response.addCookie(cookie_pw);
			
			out.println("welcome1 " + uid);
			out.println(ptr);
		}
		
		for(Cookie ck : cookies) {
			if(ck.getName().equals("userID")&&!ck.getValue().equals("")) {
				out.println("welcome1 " + ck.getValue());
			}
		}
		out.println(ptr);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
