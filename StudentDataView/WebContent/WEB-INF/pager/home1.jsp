<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>this is final</h1>
<c:forEach var="localer" items="${kml}">
    <h3>${localer.id} ${localer.name} ${localer.job} ${localer.address} ${localer.city} ${localer.address} ${localer.sallary} </h3>
    </c:forEach>
