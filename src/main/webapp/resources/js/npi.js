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

function excluir(uri, row) {
	var dt = $("#contatos").dataTable();
	$.ajax({
		type : "DELETE",
		url : uri,
		success : function(data) {
			dt.fnDeleteRow(row-1);
			dt.fnDraw();		}
	});
	
	//Precisa verificar o método delete para que a chamada ajax obtenha sucesso, nom momento não está dando sucesso.
	//Error 405, method not allowed
	dt.fnDeleteRow(row-1);
	dt.fnDraw();
};
