function povoaForm(uri, form) {

	$.ajax({
		type : "GET",
		dataType : "json",
		url : uri,
		success : function(data) {

			populate(form, data);

		}
	});

};

function populate(frm, data) {
	$.each(data, function(key, value) {
		$('[name=' + key + ']', frm).val(value);
	});
}

$(document).ready(function() {

	$("#btnAdicionar").click(function() {
		var form = $("#add-contato-form");
		form.attr("method","post");
	});

	$("#btnEditar").click(function() {
		var form = $("#add-contato-form");
		form.attr("method","put");
	});

	$("#myModal").on("hidden.bs.modal", function(e) {

		console.log("TESTE");
		document.getElementById("add-contato-form").reset();

	});

});

function excluir(uri) {

	$.ajax({
		type : "DELETE",
		url : uri,
		success : function(data) {
			$("#contatos").dataTable()._fnAjaxUpdate();
		}
	});

};
