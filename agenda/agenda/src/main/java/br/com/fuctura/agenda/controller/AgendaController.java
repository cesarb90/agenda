package br.com.fuctura.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fuctura.agenda.dto.ContatoRequestDTO;
import br.com.fuctura.agenda.dto.ContatoResponseDTO;

@Controller
@RequestMapping(path ="/agenda")
public class AgendaController {
	
//	@ResponseBody
//	@RequestMapping(method = RequestMethod.POST, path = "/cadastrar")
//	public ContatoResponseDTO cadastrar(@RequestBody ContatoRequestDTO request) {
//		System.out.println(request.getIdade());
//
//		ContatoResponseDTO response = new ContatoResponseDTO();
//		response.setMensagem("Cadastrado com sucesso!");
//		return response;
//	}
	
//	@ResponseBody
//	@RequestMapping(method = RequestMethod.GET, path = "/pesquisar")
//	public ContatoResponseDTO procurar() {
//		ContatoResponseDTO response = new ContatoResponseDTO();
//		response.setMensagem("Cadastro com sucesso!");
//		return response;
//			
//		}
//	@ResponseBody
//	@RequestMapping(method = RequestMethod.POST, path = "/estatistica/resumida")
//	public ContatoResponseDTO resumida(@RequestBody ContatoRequestDTO request) {
//		System.out.println(request.getIdade() + request.getNome() + request.getAltura());
//		String nomeInvertido = request.getNome();
//		int qtdCaracteres = request.getNome().length();
//		long diasVividos = request.getIdade() * 365;
//		ContatoResponseDTO response = new ContatoResponseDTO();
//		response.setMensagem("o nome invertido é: " + new StringBuilder(nomeInvertido).reverse().toString() + " a quantidade de caracteres é: " + qtdCaracteres + " dias vividos é: "+ diasVividos);
//		
//		return response;
//	}
}
