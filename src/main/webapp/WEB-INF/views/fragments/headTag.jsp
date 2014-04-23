<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!--
PetClinic :: a Spring Framework demonstration
-->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>GPA - Inicial</title>

<spring:url value="/webjars/bootstrap/3.1.1/css/bootstrap.min.css"
	var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />

<spring:url value="/webjars/jquery/2.1.0/jquery.js" var="jQuery" />
<script src="${jQuery}"></script>

<spring:url value="/webjars/bootstrap/3.1.1/js/bootstrap.min.js" var="bootstrapJs" />
<script src="${bootstrapJs}"></script>

<!-- jquery-ui.js file is really big so we only load what we need instead of loading everything -->
<spring:url value="/webjars/jquery-ui/1.10.3/ui/jquery.ui.core.js"
	var="jQueryUiCore" />
<script src="${jQueryUiCore}"></script>

<spring:url value="/webjars/jquery-ui/1.10.3/ui/jquery.ui.datepicker.js"
	var="jQueryUiDatePicker" />
<script src="${jQueryUiDatePicker}"></script>

<!-- jquery-ui.css file is not that big so we can afford to load it -->
<spring:url value="/webjars/jquery-ui/1.10.3/themes/base/jquery-ui.css"
	var="jQueryUiCss" />
<link href="${jQueryUiCss}" rel="stylesheet"></link>



