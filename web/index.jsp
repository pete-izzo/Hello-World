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
      <h3>Please enter any text:</h3>
      <input type="text" name="testText" id="testText">
      <br>
      <br> 
      <label for="name1">Name 1:</label><br>
      <input type="text" name="name1" id="name1">
      <br> 
      <label for="name2">Name 2:</label><br>
      <input type="text" name="name2" id="name2">
      <br> 
      <label for="name3">Name 3:</label><br>
      <input type="text" name="name3" id="name3">
      <br> 
      <label for="name4">Name 4:</label><br>
      <input type="text" name="name4" id="name4">
      <br> 
      <label for="name5">Name 5:</label><br>
      <input type="text" name="name5" id="name5">
      <br> 
      
      <input type="submit" value="Submit"> 
    </form>
    </body>
  </html> 
  