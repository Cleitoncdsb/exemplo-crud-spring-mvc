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
			console.log(data);
			dt.fnDeleteRow(row-1);
			dt.fnDraw();		
		}
	});
};

//this is the id of the form 
$("#idForm").submit(function() { 
	var url = "path/to/your/script.php"; 
	var method = $("#idform").Attr('method');

	// the script where you handle the form input. 
	$.ajax({ 
	type: method, 
	url: url, 
	data: $("#idForm").serialize(), 
	// serializes the form's elements. 
	success: function(data) { 
		alert(data); // show response from the php script. 
	} }); 
		return false; // avoid to execute the actual submit of the form. 
});
	

