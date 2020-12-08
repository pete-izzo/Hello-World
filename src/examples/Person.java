//Java Person class file

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

public class Person{
    private String firstName = null;
    private String lastName = null;
    private static int nextIndex = 1;
    private int index = 1;

    public Person(){
        index = nextIndex;
        nextIndex++;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getIndex() {
        String strIndex = Integer.toString(index);
        return strIndex;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}