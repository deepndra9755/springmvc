<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<h1>                          ALL  Student Details                                            </h1>

<c:forEach var="localer" items="${val}">
    <h3> ${localer.name} ${localer.last}<a href="imk?std=${localer.image}">download</a>  </h3>
       
    </c:forEach>
<%--     <a href="hand?id=${localer.id}">edit</a> --%>