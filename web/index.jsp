<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
  
    <form action="ReverseServlet" method="POST">
      <h3>Please enter your name:</h3>
      <input type="text" name="testText" id="testText"> 
      
      <input type="submit" value="Submit"> 
    </form>
    </body>
  </html> 
  