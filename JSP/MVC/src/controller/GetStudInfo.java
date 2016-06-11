package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import model.StudModel;

@WebServlet("/GetStudInfo")
public class GetStudInfo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudModel model=new StudModel();
		ArrayList<Student> list=model.getData();
		request.setAttribute("studentList", list);
		RequestDispatcher dis=request.getRequestDispatcher("View.jsp");
		dis.forward(request, response);
				
	}

}
