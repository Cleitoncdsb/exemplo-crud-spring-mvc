
function submeterForm() {

	console.log("Teste de submite OK");


	var id =$('#id');
	var idContato = id.attr('value');
	
	var form = $('#add-contato-form');
	var serializedData = form.serialize();
	
	console.log(ConvertFormToJSON(form));
	
	if(idContato != ""){
		console.log("entrou aqui");
		//Chamada AJAX para EDITAR contato

		var request = $.ajax({
			contentType : "application/json",
			type : "PUT",
			dataType : "json",
			url : "http://localhost:8080/exemplo-jpa-spring-mvc/contatos/",
			data : form.serializeObject()
		});
		
		request.done(function(data) {
		
			console.log("SUCESSO ao editar contato");
			
		});
		
		request.fail(function(data) {
			console.log(serializedData);
			console.log("ERRO ao editar contato");
			
		});
		
	}else{
		//Chamada AJAX para INSERIR contato 
		$.ajax({
			type : "POST",
			dataType : "json",
			url : uri,
			data : serializedData
			
		
		
		});
	}

};


function ConvertFormToJSON(form){ 
	var array = jQuery(form).serializeArray(); 
	var json = {}; 
	jQuery.each(array, function() { 
		json[this.name] = this.value || ''; 
	}); 
	
	return json; 
}


function povoaForm(uri, form) {

	$.ajax({
		type : "GET",
		dataType : "json",
		url : uri,
		success : function(data) {

			console.log(data);
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
	
	/*
	$("#btnAdicionar").click(function() {
		var form = $("#add-contato-form");
		form.attr("method","post");
	});

	$("#btnEditar").click(function() {
		var form = $("#add-contato-form");
		form.attr("method","put");
	});
	
	
	$("#gravar").click(function(ev) {
		
		submeterForm();
	});
*/
	$("#myModal").on("hidden.bs.modal", function(e) {
		document.getElementById("add-contato-form").reset();
		var id =$('#id');
		console.log(id.attr('value',''));
	});

});

function excluir(idTable ,uri, row) {
	var dt = $(idTable).dataTable();

	var confirme = confirm('Deseja apagar este contato?');

	if(confirme){
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
	}else{
		event.preventDefault();
	}
};

/*
 * 
 * //this is the id of the form $("#idForm").submit(function() { var url =
 * "path/to/your/script.php"; var method = $("#idform").Attr('method'); // the
 * script where you handle the form input. $.ajax({ type: method, url: url,
 * data: $("#idForm").serialize(), // serializes the form's elements. success:
 * function(data) { alert(data); // show response from the php script. } });
 * return false; // avoid to execute the actual submit of the form. });
 * 
 * 
 */
