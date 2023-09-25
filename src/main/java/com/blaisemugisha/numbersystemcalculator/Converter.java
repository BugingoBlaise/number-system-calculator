package com.blaisemugisha.numbersystemcalculator;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Converter", value = "/Converter")
public class Converter extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String conversionType = request.getParameter("conversionType");

        int baseTen = Integer.parseInt(request.getParameter("baseten"));

        if ("binary".equals(conversionType)) {
            String result = convertToBinary(baseTen);

            request.setAttribute("baseten", baseTen);
            request.setAttribute("result", result);
            request.setAttribute("message", "Decimal number converted to binary");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if ("hexa".equals(conversionType)) {
            String result = convertToHexadecimal(baseTen);

            request.setAttribute("baseten", baseTen);
            request.setAttribute("result", result);
            request.setAttribute("message", "Decimal number converted to Hexadecimal");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if ("octal".equals(conversionType)) {
            String result = convertToOctal(baseTen);

            request.setAttribute("baseten", baseTen);
            request.setAttribute("result", result);
            request.setAttribute("message", "Decimal number converted to Octal");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    public static String convertToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    public static String convertToHexadecimal(int decimalNumber) {
        return Integer.toHexString(decimalNumber);
    }

    public static String convertToOctal(int decimalNumber) {
        return Integer.toOctalString(decimalNumber);
    }
}