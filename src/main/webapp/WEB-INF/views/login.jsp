<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Página de Login</title>
<link href="<c:url value="/webjars/bootstrap/3.1.1/css/bootstrap.min.css" />" rel="stylesheet" />
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
.center {
     float: none;
     margin-left: auto;
     margin-right: auto;
     padding-top: 100px;
}
</style>
</head>
<body onload='document.f.j_username.focus();'>
 
	<c:if test="${not empty error}">
		<div class="errorblock">
			Sua tentativa de login não obteve sucesso, tente novamente.<br /> Causa :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
		<div class="center col-md-4">
			<div style="text-align: center" class="panel panel-default">
				<div class="panel-heading">
					<h5 class="panel-title">Login</h5>
				</div>
				<div class="panel-body">
					<form name='f' action="<c:url value='j_spring_security_check' />"
						method='POST'>
						<div class="form-group col-md-12 form-inline">
							<h4 class="col-md-4">Usuário:</h4>
							<input class="col-md-8 form-control" type='text'
								name='j_username' value=''>
						</div>
						<div class="form-group col-md-12 form-inline">
							<h4 class="col-md-4">Senha:</h4>
							<input class="col-md-8 form-control" type='password'
								name='j_password' />
						</div>
						<input class="btn btn-primary" name="submit" type="submit"
							value="Login" value="Login" /> <input class="btn btn-default"
							name="reset" type="reset" value="Limpar" />
					</form>
				</div>
			</div>
		</div>
</body>
</html>