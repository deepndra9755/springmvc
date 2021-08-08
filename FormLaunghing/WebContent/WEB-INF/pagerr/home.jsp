<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
    
    <frm:form action="home" method="POST" modelAttribute="kmll">
    <h1>
    id<frm:input type="text" path="id"/>
    name<frm:input type="text" path="name"/>
    address<frm:input type="text" path="address"/>
    job<frm:input type="text" path="job"/>
    <frm:input type="submit" value="register" path=""/>
   </h1>
    </frm:form>
<a href="sws?kppd=10">getCount</a>