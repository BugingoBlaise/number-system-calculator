package com.blaisemugisha.numbersystemcalculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.Path;

import java.io.IOException;

@WebServlet("/admissionServlet")

public class admissionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentEmail=request.getParameter("email");
        String studentName=request.getParameter("names");
        String studentCourse=request.getParameter("course");

        request.setAttribute("studentEmail",studentEmail);
        request.setAttribute("studentName",studentName);
        request.setAttribute("studentCourse",studentCourse);

        request.getRequestDispatcher("preview.jsp").forward(request,response);



    }


}
