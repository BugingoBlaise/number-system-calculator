<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%--<!DOCTYPE html>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--  <meta charset="UTF-8">--%>
<%--  <title>Number Converter</title>--%>
<%--  <style>--%>
<%--    #myform{--%>
<%--      width: 400px;--%>
<%--    }--%>
<%--  </style>--%>

<%--</head>--%>
<%--<body>--%>
<%--<h1>Number Converter</h1>--%>
<%--<form action="converterServlet" method="post" id="myform">--%>
<%--  <label >Enter a Decimal Number: </label>--%>
<%--  <input type="text" name="decimalNumber">--%>

<%--  <input type="submit" value="Binary">--%>
<%--  <input type="submit" value="Hexadecimal">--%>
<%--  <input type="submit" value="Octal">--%>
<%--  <input type="submit" value="Refresh">--%>
<%--  <h1>Result: </h1>--%>
<%--  <p>Number: <span id="input-number">128</span></p>--%>
<%--  <p>Result: <span id="output-number">1000000</span></p>--%>

<%--  <ul style="list-style-type:disc">--%>
<%--    <li><span id="system-1">Decimal</span> number converted to <span id="system-2">binary</span>--%>
<%--    </li>--%>
<%--  </ul>--%>


<%--</form>--%>
<%--</body>--%>
<%--</html>--%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Number Converter</title>
  <style>
    #myform {
      width: 400px;
    }
  </style>

  <script>
    function convertNumber() {
      // Get the decimal number from the input field
      var decimalNumber = document.getElementById("decimalNumber").value;

      // Convert to binary, hexadecimal, and octal
      var binary = Number(decimalNumber).toString(2);
      var octal = Number(decimalNumber).toString(8);
      var hexadecimal = Number(decimalNumber).toString(16).toUpperCase();

      // Update the content of the <span> elements with the results
      document.getElementById("binaryResult").textContent = binary;
      document.getElementById("octalResult").textContent = octal;
      document.getElementById("hexadecimalResult").textContent = hexadecimal;
    }
  </script>
</head>
<body>
<h1>Number Converter</h1>
<form id="myform">
  <label>Enter a Decimal Number: </label>
  <input type="text" id="decimalNumber">

  <input type="button" value="Convert" onclick="convertNumber()">

  <h1>Result:</h1>
  <p>Number: <span id="input-number"></span></p>
  <p>Binary: <span id="binaryResult"></span></p>
  <p>Octal: <span id="octalResult"></span></p>
  <p>Hexadecimal: <span id="hexadecimalResult"></span></p>
</form>
</body>
</html>
