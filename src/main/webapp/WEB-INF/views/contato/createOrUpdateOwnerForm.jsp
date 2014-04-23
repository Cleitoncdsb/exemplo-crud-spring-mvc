<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>


<html lang="en">

<jsp:include page="../fragments/headTag.jsp"/>

<body>
<div class="container">
    <jsp:include page="../fragments/bodyHeader.jsp"/>
    <c:choose>
        <c:when test="${contato['id']  == NULL }"><c:set var="method" value="post"/></c:when>
        <c:otherwise><c:set var="method" value="put"/></c:otherwise>
    </c:choose>

    <h2>
        <c:if test="${contato['id']  == NULL }">New </c:if> Contato
    </h2>
    <form:form modelAttribute="contato" method="${method}" class="form-horizontal" id="add-contato-form">
       	<input type="hidden" name="id" value="${contato['id']}" />
        <petclinic:inputField label="First Name" name="nome"/>
        <petclinic:inputField label="Last Name" name="sobreNome"/>
        <petclinic:inputField label="Address" name="endereco"/>
        <petclinic:inputField label="City" name="cidade"/>
        <petclinic:inputField label="Telephone" name="fone"/>

        <div class="form-actions">
            <c:choose>
                <c:when test="${contato['id']  == NULL }">
                    <button type="submit">Add Owner</button>
                </c:when>
                <c:otherwise>
                    <button type="submit">Update Owner</button>
                </c:otherwise>
            </c:choose>
        </div>
    </form:form>
</div>
<jsp:include page="../fragments/footer.jsp"/>
</body>

</html>
