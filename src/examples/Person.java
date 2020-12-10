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

public class Person {
    private String firstName = null;
    private String lastName = null;
    //private static int nextIndex = 1;
    private String index;

    public Person(){
        // index = nextIndex;
        // nextIndex++;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getIndex() {
        return index;
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

    public void setIndex(String index) {
        this.index = index;
    }

    // public static Comparator<Person> PersonComparator = new Comparator<Person>() {

    //     public int compare(Person p1, Person p2) {
    //         String PersonIndex1 = p1.getIndex().toUpperCase();
    //         String PersonIndex2 = p2.getIndex().toUpperCase();

    //         return PersonIndex1.compareTo(PersonIndex2);
    //     }
    // };

    



}