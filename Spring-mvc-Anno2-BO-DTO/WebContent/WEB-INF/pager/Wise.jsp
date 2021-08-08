<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>this is final</h1>
<c:forEach var="localer" items="${val}" >
    <h3>${localer.id}<</h3>
    <h3>${localer.name}<</h3>
    <h3>${localer.last}<</h3>
    <h3>${localer.roll}<</h3>
    
    </c:forEach>

<h1>this is jsp final</h1>



