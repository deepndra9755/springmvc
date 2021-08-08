<%@ page isELIgnored = "false" %>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="frm"%>
<%--  <frm:form action="home" method="POST" modelAttribute="kl"> first 1 hai--%>

<frm:form modelAttribute="jop">
 
    id <frm:input type="text" path="id"/>
   
  roll <frm:input type="text"  path="roll"/>
  
  name <frm:input type="text"  path="name"/>
  
school <frm:input type="text"  path="scl"/>
 
       <frm:button name="submit" value="regi"></frm:button>

 <frm:input type="submit" value="register" path=""/>
 </frm:form>
<!--  <a href="kml"><h2>Get-WPP</h2></a>  -->
<!--  int id; -->
<!-- int roll; -->
<!-- String name; -->
<!-- String scl="GOVT"; -->