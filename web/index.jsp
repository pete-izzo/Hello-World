<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>



<html>
    <head>
      <title>Sample Application JSP Page</title>
    </head>
  
    <body bgcolor=white>
  
    <table border="0" cellpadding="10">
      <tr>
        <td align=center>
          <img src="images/thumbs.jpg">
        </td>
        <td>
           <h1>Sample Application JSP Page</h1>
        </td>
      </tr>
    </table>
  
    <br />


    <% /* <sql:setDataSource url="jdbc:derby:C:\Users\pizzo\db-derby-10.14.2.0-bin\bin\NewDBTest" var="mydb" driver="org.apache.derby.jdbc.EmbeddedDriver"/>
        <sql:query dataSource="${mydb}" var="result">
            SELECT * FROM USERS
        </sql:query>

        <table border="1" width="100%">
          <tr>
              <th>Username</th>
              <th>PW</th>
          </tr>
          <c:forEach var="row" items="${result.rows}">
          <tr>
              <td><c:out value="${row.userid}"/></td>
              <td><c:out value="${row.passwd_digest}"/></td>
          </tr>
          </c:forEach>
      </table> */ %>
    <form action="ReverseServlet" method="POST">
      <h3>Please enter any text:</h3>
      <input type="text" name="testText" id="testText">
      <br>
      <br>
      <h3>Please enter names:</h3>
      <label for="name5">Name 5:</label><br>
      <input type="text" required placeholder="Firstname Lastname" name="name5" id="name5">
      <br> 
      <label for="name3">Name 3:</label><br>
      <input type="text" required placeholder="Firstname Lastname" name="name3" id="name3">
      <br> 
      <label for="name4">Name 4:</label><br>
      <input type="text" required placeholder="Firstname Lastname" name="name4" id="name4">
      <br>  
      <label for="name6">Name 6:</label><br>
      <input type="text" required placeholder="Firstname Lastname" name="name6" id="name6">
      <br>
      <label for="name1">Name 1:</label><br>
      <input type="text" required placeholder="Firstname Lastname" name="name1" id="name1">
      <br> 
      <label for="name8">Name 8:</label><br>
      <input type="text" required placeholder="Firstname Lastname" name="name8" id="name8">
      <br>
      <label for="name2">Name 2:</label><br>
      <input type="text" required placeholder="Firstname Lastname" name="name2" id="name2">
      <br>
      <label for="name7">Name 7:</label><br>
      <input type="text" required placeholder="Firstname Lastname" name="name7" id="name7">
      <br>
      
      <input type="submit" value="Submit"> 
    </form>


    </body>
  </html>
  
  <!--


    TODO:

    have text fields send info to db

    reads

    hello displays db contents

    server.xml towrds top put db info

    servlett call 

    class driver manager
  -->
  