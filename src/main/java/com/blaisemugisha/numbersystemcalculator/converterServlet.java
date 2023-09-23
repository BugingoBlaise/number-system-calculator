package com.blaisemugisha.numbersystemcalculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;


import java.io.*;


@WebServlet(urlPatterns = "/app")
public class converterServlet extends HttpServlet {

protected void doPost(HttpServlet request,HttpServlet response) throws ServletException, IOException {

    String decimalNumber=request.getInitParameter("decimalNumber");

    try{
        // Parse the decimal string to an integer
        int decimal = Integer.parseInt(decimalNumber);

        // Convert to binary, octal, and hexadecimal
        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hexadecimal = Integer.toHexString(decimal);

        // Set the response content type and write the results
//        response.setContentType("text/html");
//        PrintWriter out=new PrintWriter("text/html");
//        out.println("<html><body>");
//        out.println("<h1>Number Conversion Results</h1>");
//        out.println("<p>Decimal: " + decimal + "</p>");
//        out.println("<p>Binary: " + binary + "</p>");
//        out.println("<p>Octal: " + octal + "</p>");
//        out.println("<p>Hexadecimal: " + hexadecimal + "</p>");
//        out.println("</body></html>");


    }catch (NumberFormatException e){
        // Handle invalid input
//        response.setContentType("text/html");

        PrintWriter out = new PrintWriter("text/html");
        out.println("<html><body>");
        out.println("<h1>Error</h1>");
        out.println("<p>Invalid input. Please enter a valid decimal number.</p>");
        out.println("</body></html>");
    }


}

}
