<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html lang="en">

<jsp:include page="fragments/headTag.jsp"/>
<link href="<c:url value="/resources/css/npi.css" />" rel="stylesheet" />

<body>
<div class="container">
    <jsp:include page="fragments/bodyHeader.jsp"/>
    <h2><fmt:message key="welcome"/></h2>

	<div id="conteudo">
	
		<img id="brasao" src='<c:url value="/resources/img/brasao.png" />'>
	
	</div>

    <jsp:include page="fragments/footer.jsp"/>

</div>
</body>

</html>