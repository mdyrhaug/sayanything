<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:forEach var="sayValue" items="${says}">
<fmt:formatDate value="${sayValue.createDate}" var="formattedDate" type="date" pattern="MM-dd-yyy" />
	<div class="say">
      <div class="pull-right sayDate">${formattedDate}</div>	
  	  <div class="sayName">${sayValue.name}<br />${sayValue.location}</div>
	  <div class="sayValue">${sayValue.say}</div>
    </div>
</c:forEach>