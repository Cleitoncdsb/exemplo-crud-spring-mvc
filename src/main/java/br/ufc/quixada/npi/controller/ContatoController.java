package br.ufc.quixada.npi.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.service.ContatoService;

@Named
@RequestMapping("/contatos")
public class ContatoController {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Inject
	private ContatoService cs;

	@RequestMapping(value="{contatoId}", method = RequestMethod.GET)
	public @ResponseBody Contato getContatoJson(@PathVariable("contatoId") int contatoId) {
 
		return this.cs.findById(contatoId);
 
	}
	
	/* Verificar porque não funciona com 0 ou 1 contatos */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String listaContatos(Contato contato, BindingResult result,
			Map<String, Object> model) {
		
		try {
			List<Contato> results = cs.findAll();
			
			model.put("selections", results);
			return "contato/contatosList";
		} catch (Exception e) {
			//Mensagem com erro
			return "contato/contatosList";
		}
		
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public @ResponseBody Contato atualizarContato(@RequestBody Contato contato, BindingResult result, SessionStatus status){		
		
		System.out.println("Chamou Atualizar " + contato.getId() );
			
		if (result.hasErrors()) {
			//Enviar erros
			return contato;
		}else{
			this.cs.atualizar(contato);
			//status.setComplete();
			return contato;
		}
	
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public @ResponseBody Contato adicionarContato(@RequestBody Contato contato,
			BindingResult result, SessionStatus status) {		
		
		if (result.hasErrors()) {
			/*incluir erros*/
			return contato;
		} else {
			this.cs.salvar(contato);
			System.out.println("\n\n\n"+contato.getId());
			status.setComplete();
			return contato;
		}
	}	
	
	@RequestMapping(value = "/{contatoId}", method = RequestMethod.DELETE)
	public @ResponseBody String deletarContato(@PathVariable("contatoId") int contatoId) {
		Contato contato = this.cs.findById(contatoId);
		
		if (contato == null) {
			/*incluir erros*/
			return "erro";
		} else {
			this.cs.delete(contato);
			return "ok";
		}
	}	
	
	/*---------------------------------------------------------------------------------------------------------*/
	

	@RequestMapping("/contatos/{contatoId}")
	public ModelAndView detalharContato(@PathVariable("contatoId") int contatoId) {
		ModelAndView mav = new ModelAndView("/contato/contatoDetails");
		System.out.println("Entrou no método 2, id:" +contatoId );
		mav.addObject(this.cs.findById(contatoId));
		return mav;
	}

}
