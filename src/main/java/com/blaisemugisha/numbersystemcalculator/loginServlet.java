package com.blaisemugisha.numbersystemcalculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.http.HttpRequest;

@WebServlet(name = "loginServlet" , value = "/loginServlet")
public class loginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String username=request.getParameter("username");
String password=request.getParameter("password");

if(username.equals("admin")&&password.equals("open")){
    request.getRequestDispatcher("index.jsp").forward(request,response);
}else{
    request.setAttribute("message", "Invalid credentials");
}


    }


}
