package com.saif.mvc_demo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcDemo
 */
@WebServlet("/MvcDemo")
public class MvcDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MvcDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// step 1: get the student data from helper class (model)
		List<Student> students = StudentDataUtil.getStudents();
		
		// step 2: add students to request object
		request.setAttribute("student_list", students);
		
		// step 3: get request dispatcher
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("view_students.jsp");		
		
		// step 4: now forward to JSP
		dispatcher.forward(request, response);
	}

	
	
	
	
	
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}