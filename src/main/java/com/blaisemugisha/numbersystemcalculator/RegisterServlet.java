package com.blaisemugisha.numbersystemcalculator;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "register", value = "/register")
public class RegisterServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");

        request.setAttribute("gettedFullname", fullname);
        request.setAttribute("gettedEmail", email);

        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}
