<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<frm:form action="sub" method="POST" modelAttribute="obj">
 name<frm:input type="text" path="name"/>

address<frm:input type="text" path="address"/>

sallary<frm:input type="text" path="sallary"/>

 city<frm:input type="text" path="city"/>

job<frm:input type="text" path="job"/>

dept<frm:input type="text" path="DEPARTMENT"/> 

 depid<frm:input type="text" path="depIDl"/>

submit<frm:input type="submit" path=""/>

</frm:form>
<h1>${obj.res}</h1>