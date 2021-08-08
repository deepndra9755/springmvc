<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>this is final</h1>
<c:forEach var="localer" items="${val}" >
    <h3>id ${localer.id} name ${localer.name} last  ${localer.last} roll  ${localer.roll}  <a href="edt?id=${localer.id}">Edit</a> <a href="dlt?id=${localer.id}">delete</a>  </h3>  
    </c:forEach>

<h1> <a href="regi">Register!</a> </h1>       <h1> <a href="home">Home</a> </h1>



