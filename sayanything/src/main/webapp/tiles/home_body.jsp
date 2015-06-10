<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<c:forEach var="sayValue" items="${says}">
	<div class="say">
		<h5>${sayValue.name}</h5>
		<h6>${sayValue.location}</h6>
		<p>${sayValue.say}</p>
	</div>
</c:forEach>