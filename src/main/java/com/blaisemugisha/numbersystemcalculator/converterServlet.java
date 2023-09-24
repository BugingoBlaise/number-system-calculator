package com.blaisemugisha.numbersystemcalculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


import java.io.*;


//@WebServlet()
public class converterServlet extends HttpServlet{

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String decimalString=request.getParameter("decimalNumber");

    // Initialize the result variables
    String conversionType = request.getParameter("conversionType");
    String result = "";
    try{
        // Parse the decimal string to an integer
        int decimal = Integer.parseInt(decimalString);

        // Perform the conversion based on the selected button
        switch (conversionType) {
            case "Binary":
                result = Integer.toBinaryString(decimal);
                break;
            case "Hexadecimal":
                result = Integer.toHexString(decimal).toUpperCase();
                break;
            case "Octal":
                result = Integer.toOctalString(decimal);
                break;
            case "Refresh":
                result = ""; // Clear the result
                break;
            default:
                result = "Invalid conversion type"; // Handle unsupported conversion type
        }


    }catch (NumberFormatException e){
        // Handle invalid input
        request.setAttribute("error", "Invalid input. Please enter a valid decimal number.");
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }


}

}
