<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>this is final</h1>
<c:forEach var="localer" items="${kml}">
    <h3>${localer.id} ${localer.name} ${localer.job} ${localer.address} ${localer.city} ${localer.address} ${localer.sallary} <a href="hand?id=${localer.id}">edit</a> <a href="hand?id=${localer.id}">delete</a> </h3>
       
    </c:forEach>

 
<h1><a href="register">NewUser</a></h1>

<c:if test = "${val>0}">
         <p>My salary is:  <c:out value = "${val}"/><p>
      </c:if>