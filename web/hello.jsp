<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body {
    background-image:
        url('https://i.pinimg.com/originals/e9/bd/71/e9bd71bac8e86ffa192dec224a3ee16f.png');
}
</style>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
 
    <h1>Here is what you typed ${userText}</h1>
    <!--If there isn't a comma present in userText will reverse order-->
    <c:if test="${!fn:contains(userText, ',')}">
        <h1>Here is what you typed...but in reverse: ${reversedString}</h1>
    </c:if>

    <!--If a comma is present in userText print lines seperately-->
    <c:if test="${fn:contains(userText, ',')}">
        <h1>Everything get's printed seperately:</h1>
        <c:forEach items="${CSV}" var="element">
            <h5>${element}</h5>
        </c:forEach>
    </c:if>
    
    
    <c:out value="TEXT USING JSTL"/>

    <c:set var="foo" scope="session" value="${fn:split(reversedString, '')}" />
    <c:if test="${fn:length(reversedString) > 8}">
        <br>
        <c:out value="Wow thats a big word. It's over 8 characters long"/>
        
    </c:if>
    <br>
    <p>${foo}</p>
    <br>
    <c:out value="${session}"/>
</body>
</html>