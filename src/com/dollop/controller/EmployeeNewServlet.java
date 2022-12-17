package com.dollop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dollop.dao.EmployeeDAO;
import com.dollop.dao.EmployeeDAOImpl;
import com.dollop.entity.Employee;

/**
 * Servlet implementation class EmployeeNewServlet
 */
public class EmployeeNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeNewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp=new Employee();
		EmployeeDAO employeeDAO=new EmployeeDAOImpl();
		emp.setName(request.getParameter("name"));
		emp.setDob(request.getParameter("dob"));
		emp.setDepartment(request.getParameter("department"));
		System.out.println(emp);
		if(employeeDAO.save(emp)) {
			request.setAttribute("NOTIFICATION", "Employee Saved Successfully!");
		}
		RequestDispatcher rd= request.getRequestDispatcher("newviews/employee-form.jsp");
				rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
