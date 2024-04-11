package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class t1Servlet
 */
@WebServlet("/t1Servlet")
public class t1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public t1Servlet() {
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
		String uname = request.getParameter("name");
		String unum = request.getParameter("num");
		String dec = "man";
		
		if(unum.charAt(0)=='1' || unum.substring(0,1).equals("3")) {
			dec = "man";
			response.sendRedirect("t2Servlet?name="+uname+"&num="+dec);
		}
		else if(unum.charAt(0)=='2' || unum.substring(0,1).equals("4")) {
			dec = "woman";
			response.sendRedirect("t2Servlet?name="+uname+"&num="+dec);
		}
			
		
		out.print(uname + " "+unum);
	}

}
