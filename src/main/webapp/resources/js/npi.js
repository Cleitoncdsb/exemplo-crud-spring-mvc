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
		document.getElementById("add-contato-form").reset();
	});

});

function excluir(idTable ,uri, row) {
	var dt = $(idTable).dataTable();
	$.ajax({
		type : "DELETE",
		url : uri,
		success : function(data) {
			if(data=="ok"){
			  $('#mensagens').removeClass('alert-danger');
			  $('#mensagens').addClass('alert-success');
			  $('#mensagens').show();	
			  $('#mensagens').text("Remoção Feita com Sucesso");
		      $('#mensagens').fadeOut(4000);
			  dt.fnDeleteRow($(row).parents('tr')[0]);
			}else{
				$('#mensagens').removeClass('alert-success');
				$('#mensagens').addClass('alert-danger');
				$('#mensagens').show();	
				$('#mensagens').text("Reportando Erros");
			      
			}
		}
	});
};