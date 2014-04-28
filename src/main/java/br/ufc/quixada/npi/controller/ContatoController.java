package br.ufc.quixada.npi.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
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
	@Inject
	private ContatoService cs;

	@RequestMapping(value="{contatoId}", method = RequestMethod.GET)
	public @ResponseBody Contato getContatoJson(@PathVariable("contatoId") int contatoId) {
 
		return this.cs.findById(contatoId);
 
	}
	
	
	/*-- RETIRAR OS REDIRECTS, ACHO QUE USANDO AJAX --*/
	
	
	/* Verificar porque não funciona com 0 ou 1 contatos */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String listaContatos(Contato contato, BindingResult result,
			Map<String, Object> model) {

		// allow parameterless GET request for /owners to return all records
		if (contato.getNome() == null) {
			contato.setNome(""); // empty string signifies broadest possible
									// search
		}

		// find owners by last name
		List<Contato> results = cs.findAll();
		if (results.size() < 1) {
			// no owners found
			result.rejectValue("lastName", "notFound", "not found");
			return "contato/contatosList";
		}
		if (results.size() > 1) {
			// multiple owners found
			model.put("selections", results);
			return "contato/contatosList";
		} else {
			// 1 owner found
			contato = results.iterator().next();
			return "contato/contatosList";
		}
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public String atualizarContato(@Valid Contato contato,
			BindingResult result, SessionStatus status) {
	
		if (result.hasErrors()) {
			/* mandar mensagem de erro para o form */
			return "contato/contatosList";
		} else {
			//contato.setId(contatoId);
			System.out.println("Chamou Atualizar" +contato.getId() );
			
			this.cs.atualizar(contato);
			status.setComplete();
			return "redirect:/contatos";
		}
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String adicionarContato(@Valid Contato contato,
			BindingResult result, SessionStatus status) {
		if (result.hasErrors()) {
			/*incluir erros*/
			return "redirect:/contatos";
		} else {
			this.cs.salvar(contato);
			status.setComplete();
			return "redirect:/contatos";
		}
	}	
	
	@RequestMapping(value = "/{contatoId}", method = RequestMethod.DELETE)
	public String deletarContato(@PathVariable("contatoId") int contatoId) {
		Contato contato = this.cs.findById(contatoId);
		
		if (contato == null) {
			/*incluir erros*/
			return "redirect:/contatos";
		} else {
			this.cs.delete(contato);
			return "redirect:/contatos";
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
