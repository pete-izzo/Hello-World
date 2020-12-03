// Java program to Reverse a String  by
// converting string to characters  one
// by one

package examples;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
 
// Class of ReverseString/
//@WebServlet("/index.jsp")
public class ReverseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/css");

        PrintWriter out = response.getWriter();
        
        String fname = request.getParameter("testText");


        // gets session and sets and attribute with a key-value pair
        //key is "userText" value is "fname"
        HttpSession session = request.getSession();
        session.setAttribute("userText", fname);
        
        //get bytes method to convert string
        //fname into bytes
        byte[] fnameBytes = fname.getBytes();
        byte [] result = new byte[fnameBytes.length];

        //store result in reverse order into the result byte[]
        for (int i = 0; i < fnameBytes.length; i++)
            result[i] = fnameBytes[fnameBytes.length - i - 1];
        
        //save result as a new string names output
        String output = new String(result, StandardCharsets.UTF_8);

        //save reversed string as a new session attribute 
        session.setAttribute("reversedString", output);

        response.sendRedirect("hello.jsp");

        // session.setAttribute()
        // // convert String to character array
        // // by using toCharArray
        // char[] try1 = fname.toCharArray();

        // for (int i = try1.length - 1; i >= 0; i--)
        //     System.out.print(try1[i]);
        
        // response.sendRedirect("hello.jsp");
        // response.getWriter().println("Cool beans");
    }
}