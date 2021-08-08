<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>this is final</h1>
<c:forEach var="localer" items="${val}" >
    <h3>id ${localer.id} name ${localer.name} last  ${localer.last} roll  ${localer.roll}   </h3>  
    </c:forEach>

<h1>this is jsp final</h1>



