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
        String[] result1 = name1.split(" ");

        String name2 = request.getParameter("name2");
        String[] result2 = name2.split(" ");

        String name3 = request.getParameter("name3");
        String[] result3 = name3.split(" ");

        String name4 = request.getParameter("name4");
        String [] result4 = name4.split(" ");

        String name5 = request.getParameter("name5");
        String [] result5 = name5.split(" ");


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

        ArrayList<Object> names = new ArrayList<Object>();

        Person testPerson = new Person();
        testPerson.setFirstName("Max");
        testPerson.setLastName("Power");

        Person person1 = new Person();
        person1.setFirstName(result1[0]);
        person1.setLastName(result1[1]);

        Person person2 = new Person();
        person2.setFirstName(result2[0]);
        person2.setLastName(result2[1]);

        Person person3 = new Person();
        person3.setFirstName(result3[0]);
        person3.setLastName(result3[1]);

        Person person4 = new Person();
        person4.setFirstName(result4[0]);
        person4.setLastName(result4[1]);

        Person person5 = new Person();
        person5.setFirstName(result5[0]);
        person5.setLastName(result5[1]);

        names.add(person1);
        names.add(person2);
        names.add(person3);
        names.add(person4);
        names.add(person5);


        session.setAttribute("testPerson", person1);

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