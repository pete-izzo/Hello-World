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
import static java.lang.System.*;
import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
 
// Class of ReverseString/
//@WebServlet("/index.jsp")
public class ReverseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        
        String randText = request.getParameter("testText");

        String name1 = request.getParameter("name1");
        String name2 = request.getParameter("name1");
        String name3 = request.getParameter("name1");
        String name4 = request.getParameter("name1");
        String name5 = request.getParameter("name1");


        // gets session and sets and attribute with a key-value pair
        //key is "userText" value is "randText"
        HttpSession session = request.getSession();
        session.setAttribute("userText", randText);

        //if a comma(s) is present in the submission
        //this will create an array-list that contains and
        //seperates all elements  
        if (randText.indexOf(',')!= -1 ) {
            StringTokenizer st = new StringTokenizer(randText, ",");

            List<String> elements = new ArrayList<String>();

            while (st.hasMoreTokens()) {


                elements.add(st.nextToken());

            }

            session.setAttribute("CSV", elements);

        //if no commas are present reverse the string
        } else {
            
            //get bytes method to convert string
            //randText into bytes
            byte[] randTextBytes = randText.getBytes();
            byte [] result = new byte[randTextBytes.length];

            //store result in reverse order into the result byte[]
            for (int i = 0; i < randTextBytes.length; i++)
                result[i] = randTextBytes[randTextBytes.length - i - 1];
            
            //save result as a new string names output
            String output = new String(result, StandardCharsets.UTF_8);

            //save reversed string as a new session attribute 
            session.setAttribute("reversedString", output);

        }

        Employee pObj = new Person();
        pObj.setFirstName();
        pObj.setLastName();

        for(int i = 1; i)

        session.setAttribute("person", pObj);

        response.sendRedirect ("hello.jsp");

        

        // session.setAttribute()
        // // convert String to character array
        // // by using toCharArray
        // char[] try1 = randText.toCharArray();

        // for (int i = try1.length - 1; i >= 0; i--)
        //     System.out.print(try1[i]);
        
        // response.sendRedirect("hello.jsp");
        // response.getWriter().println("Cool beans");
    }
}