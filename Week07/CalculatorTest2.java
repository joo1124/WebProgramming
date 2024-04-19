package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorTest2
 */
@WebServlet("/CalculatorTest2")
public class CalculatorTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorTest2() {
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
		
		String num1 = request.getParameter("n1");
		String num2 = request.getParameter("n2");
		String op1 = request.getParameter("op");
		int result = 0;
		
		switch(op1) {
		case "+" :
			result = Integer.parseInt(num1) + Integer.parseInt(num2);
			out.print("계산 결과 : " + result);
			break;
		case "-" :
			result = Integer.parseInt(num1) - Integer.parseInt(num2);
			out.print("계산 결과 : " + result);
			break;
		case "*" :
			result = Integer.parseInt(num1) * Integer.parseInt(num2);
			out.print("계산 결과 : " + result);
			break;
		case "/" :
			result = Integer.parseInt(num1) / Integer.parseInt(num2);
			out.print("계산 결과 : " + result);
			break;
		}
		
		
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
