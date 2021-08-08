<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<<frm:form action="regi" method="POST" modelAttribute="formm">
name <frm:input type="text" path="name"/>
address <frm:input type="text" path="address"/>
city <frm:input type="text" path="city"/>
sallary <frm:input type="text" path="sallary"/>
job <frm:input type="text" path="job"/>
department <frm:input type="text" path="DEPARTMENT"/>

<frm:input type="submit" value="Register" path=""/>
record ${val} 
</frm:form>
