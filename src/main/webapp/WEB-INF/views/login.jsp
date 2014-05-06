<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page</title>
<jsp:include page="./fragments/headTag.jsp" />
<style type="text/css">
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #f5f5f5;
}

.form-signin {
	max-width: 400px;
	padding: 19px 29px 29px;
	margin: 0 auto 20px;
	background-color: #fff;
	border: 1px solid #e5e5e5;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
}

.form-signin .form-signin-heading,.form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin input[type="text"],.form-signin input[type="password"] {
	font-size: 16px;
	height: auto;
	margin-bottom: 15px;
	padding: 7px 9px;
}
</style>
</head>
<body onload='document.f.j_username.focus();'>


	<div class="container">
		<c:if test="${not empty error}">
			<div class="errorblock">
				Sua tentativa de login n�o obteve sucesso, tente novamente.<br />
				Causa : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
			</div>
		</c:if>

		<form method="POST" class="form-signin" name='f'
			action="<c:url value='j_spring_security_check' />">
			<h2 class="form-signin-heading">Acessar sistema</h2>

			<div class="form-group">
				<label class="col-sm-2 control-label" for="nome">Login</label>
				<div class="col-sm-10">
					<input type="text" class="input-block-level"
						placeholder="Login" name='j_username' />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label" for="nome">Senha</label>
				<div class="col-sm-10">
					<input type="password" class="input-block-level"
						placeholder="Senha" name='j_password' />
				</div>
			</div>

			<button class="btn btn-primary" type="submit">Entrar</button>
		</form>



	</div>
	<!-- /container -->
</body>
</html>