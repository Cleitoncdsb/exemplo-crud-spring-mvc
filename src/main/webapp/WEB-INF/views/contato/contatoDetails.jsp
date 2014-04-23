<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<html lang="en">

<jsp:include page="../fragments/headTag.jsp" />

<body>
	<div class="jumbotron">
		<jsp:include page="../fragments/bodyHeader.jsp" />

		<h2>Informações do Contato</h2>

		<table class="table table-striped" style="width: 600px;">
			<tr>
				<th>Nome Completo</th>
				<td><b><c:out value="${contato.nome} ${contato.sobreNome}" /></b></td>
			</tr>
			<tr>
				<th>Cidade</th>
				<td><c:out value="${contato.cidade}" /></td>
			</tr>
			<tr>
				<th>Endereço</th>
				<td><c:out value="${contato.endereco}" /></td>
			</tr>

			<tr>
				<th>Telefone</th>
				<td><c:out value="${contato.fone}" /></td>
			</tr>
			<tr>
				<th>E-mail</th>
				<td><c:out value="${contato.email}" /></td>
			</tr>
			<tr>
				<td><spring:url value="{contatoId}/edit" var="editUrl">
						<spring:param name="contatoId" value="${contato.id}" />
					</spring:url> <a href="${fn:escapeXml(editUrl)}" class="btn btn-info">Edite
						Contato</a></td>

			</tr>
		</table>

		<jsp:include page="../fragments/footer.jsp" />

	</div>

</body>

</html>
