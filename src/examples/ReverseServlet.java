// Java program to Reverse a String  by
// converting string to characters  one
// by one

package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import java.lang.*;
import static java.lang.System.*;
import java.lang.Object;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
// Class of ReverseString/
//@WebServlet("/index.jsp")
public class ReverseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        
        String randText = request.getParameter("testText");

        //KEEPING THE BELOW CODE UNCOMMENTED WILL CAUSE ISSUES WITH NEW LOOP

        // String name1 = request.getParameter("name1");
        // String[] result1 = name1.split(" ");

        // String name2 = request.getParameter("name2");
        // String[] result2 = name2.split(" ");

        // String name3 = request.getParameter("name3");
        // String[] result3 = name3.split(" ");

        // String name4 = request.getParameter("name4");
        // String [] result4 = name4.split(" ");

        // String name5 = request.getParameter("name5");
        // String [] result5 = name5.split(" ");

        
        // gets session and sets and attribute with a key-value pair
        //key is "userText" value is "randText"
        HttpSession session = request.getSession();



        /**
         * //////////////////////////////
         * CODE BELOW IS COMMENTED OUT BECAUSE IT WAS 
         * CAUSING ISSUES WITH NEW ENNUMERATOR. IF UNCOMMENTED BE SURE TO ALSO 
         * UNCOMMENT INPUT FIELD IN index.jsp AND USE A TWO-WORD INPUT LIKE "Spongebob Squarepants"
         * //////////////////////////////
         */
        // session.setAttribute("userText", randText);

        //if a comma(s) is present in the submission
        //this will create an array-list that contains and
        //seperates all elements  
        // if (randText.indexOf(',')!= -1 ) {
        //     StringTokenizer st = new StringTokenizer(randText, ",");

        //     List<String> elements = new ArrayList<String>();

        //     while (st.hasMoreTokens()) {


        //         elements.add(st.nextToken());

        //     }

        //     session.setAttribute("CSV", elements);

        // //if no commas are present reverse the string
        // } else {
            
        //     //get bytes method to convert string
        //     //randText into bytes
        //     byte[] randTextBytes = randText.getBytes();
        //     byte [] result = new byte[randTextBytes.length];

        //     //store result in reverse order into the result byte[]
        //     for (int i = 0; i < randTextBytes.length; i++)
        //         result[i] = randTextBytes[randTextBytes.length - i - 1];
            
        //     //save result as a new string names output
        //     String output = new String(result, StandardCharsets.UTF_8);

        //     //save reversed string as a new session attribute 
        //     session.setAttribute("reversedString", output);

        // }

        //THIS CODE IS DYNAMIC AND WILL PLACE AS MANY NAMES IN THE TABLE AS THERE ARE TEXT FIELDS

        //*****DONT DELETE*****
         ArrayList<Person> names = new ArrayList<Person>();

        /**
         *  //////////////////////////////////////
         *  Test DB stuff
         *  //////////////////////////////////////
         */
        
        
        // Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

        String dbURL ="java:comp/env/jdbc/NewDBTest";

        String driver = "org.apache.derby.jdbc.EmbeddedDriver";

        // try {
        //     Class.forName(driver);
        // } catch(java.lang.ClassNotFoundException e) {
        //     e.printStackTrace();
        // }

        // try (Connection connection = DriverManager.getConnection(dbURL);){

        // } catch (SQLException sqlExcept) {
        //     sqlExcept.printStackTrace();
        // }
        // String tableName = "users";

        // insertUsers("test guy");
        // selectUsers();
        // shutdown();
        Context ctx = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        // try {
        //     Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        //     conn = DriverManager.getConnection(dbURL);
        // } catch (Exception except) {
        //     except.printStackTrace();
        // }

        // private static void insertUsers(String userID){
        //     try {
        //         stmt = conn.createStatement();
        //         stmt.execute("insert into " + tableName + " values (" + userID + "')'");
        //         stmt.close();
        //     } catch (SQLException sqlExcept) {
        //         sqlExcept.printStackTrace();
        //     }
        // }

        // private static void selectUsers() {
        //     try {
        //         stmt = conn.createStatement();
        //         ResultSet results stmt.executeQuery("select * from " + tableName);
        //         resultSetMetaData rsmd = results.getMetaData();
        //         int numberCols = rsmd.getColumnCount();
                

        //         while(results.next()) {
        //             String userID = results.getString(1);
        //             String password = results.getString(2);
        //         }
        //         results.close();
        //         stmt.close();
        //     }
        //     catch (SQLException sqlExcept) {
        //         sqlExcept.printStackTrace();
        //     }
        // }

        // private static void shutdown() {
        //     try {
        //         if(stmt != null) {
        //             stmt.close();
        //         }
        //         if(conn != null) {
        //             DriverManager.getConnection(dbURL + ";shutdown=true");
        //             conn.close();
        //         }
        //     }
        //     catch (SQLException sqlExcept) {

        //     }
        // }

        ArrayList<Object> testDBOutput = new ArrayList<Object>();


        



        /**
         * ///////////////////////////////
         * Code below goes through all input fields and 
         * creates a new class instance each time.
         * Better than the for-loop because now the 'name'
         * of the jsp element doesn't have to be "name",
         *  it can be numbered and it won't effect anything
         * ///////////////////////////////
         */   

        Enumeration e = request.getParameterNames();

 
        while(e.hasMoreElements()) {
            Object obj = e.nextElement();
            String fieldName = (String) obj;
            String fieldValue = request.getParameter(fieldName);
            Person person = new Person();
            String[] testNum = fieldName.split("e");
            try {
                ctx = new InitialContext();
                DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/firstDB");
    
                con = ds.getConnection();

                stmt = con.createStatement();
                rs = stmt.executeQuery("select * from users");
                // st.close();
                // stmt = con.createStatement();
        
                // rs = stmt.executeQuery("SELECT * FROM USERS");

                while(rs.next()) {
                    testDBOutput.add(rs.getString("userid"));
                }

                //try to print DB info

                String productInfo = con.getMetaData().getDatabaseProductName();

                session.setAttribute("DBProductInfo", productInfo);

                
            } catch (NamingException ex) {
    
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    rs.close();
                    stmt.close();
                    con.close();
                    ctx.close();
    
    
        
                }catch (SQLException error) {
                    error.printStackTrace();
                }catch (NamingException error) {
                    error.printStackTrace();
                }
            }  

            String[] result = fieldValue.split(" ");
            person.setFirstName(result[0]);
            person.setLastName(result[1]);
            person.setIndex(testNum[1]);
            names.add(person);

            
            
            //names.add(person);

            // if(fieldName.equals("name" + strID)){

            //     Person person = new Person();

            //     String[] result = fieldValue.split(" ");
            //     person.setFirstName(result[0]);
            //     person.setLastName(result[1]);
            //     names.add(person);
            //     //names.add(person);
            //     ++id;
            // }



        }

        // GRABS THE ELEMENTS FOR ALL PARAMETERS NAMED 'NAME' AND STICKS THEM IN A STRING ARRAY
        // String allElements[] = request.getParameterValues("name");

        // //ITERATE OVER THE ELEMENTS IN THE ARRAY
        // for(int i=0; i < allElements.length; i++) {
        //     //FOR EACH ELEMENT, CREATE A NEW PERSON OBJ
        //     Person person = new Person();

        //     //FOR EACH ELEMENT, GRAB THE VALUES SUBMITTED AND SPLIT THEM UP BY THE SPACE
        //     // SET FIRST NAME AND LAST NAME ACCORDINGLY AND ADD THE FINAL PERSON TO THE ARRAY LIST
        //     String[] result = allElements[i].split(" ");
        //     person.setFirstName(result[0]);
        //     person.setLastName(result[1]);
        //     names.add(person);

        // }
        
        //names.sort(Comparator.comparing(Person.getIndex()));

        //names.sort(PersonComparator);

        Collections.sort(names, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2){
                return p1.getIndex().compareTo(p2.getIndex());
            }
        });

        session.setAttribute("testPerson", names);

        session.setAttribute("testDB", testDBOutput);


        //session.setAttribute("testPerson", personSet);

        response.sendRedirect ("hello.jsp");
    }
}