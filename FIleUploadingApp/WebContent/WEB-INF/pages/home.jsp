<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>
<frm:form action="procc" method="POST" modelAttribute="frmm" enctype="multipart/form-data">
<h1>Name<frm:input type="text" path="name"/>
    Last<frm:input type="text" path="last"/>
   Image<frm:input type="file" path="image"/>
     <br>
<%--      DOB<frm:input type="date" path="dt"/> --%>

<frm:input type="submit" value="register" path=""/>
</h1>
</frm:form>
<a href="std">getAllStudent</a>