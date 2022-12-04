package br.com.fuctura.agenda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.agenda.dto.ContatoRequestDTO;
import br.com.fuctura.agenda.dto.ContatoResponseDTO;

@RestController
@RequestMapping(path = "/agenda")
public class AgendaRestController {

	@PostMapping (path = "/cadastrar")
	public ContatoResponseDTO cadastrar(@RequestBody ContatoRequestDTO request) {
		System.out.println(request.getIdade());

		ContatoResponseDTO response = new ContatoResponseDTO();
		response.setMensagem("Cadastrado com sucesso!");
		return response;
	}
	@GetMapping(path = "/pesquisar")
	public ContatoResponseDTO procurar() {
		ContatoResponseDTO response = new ContatoResponseDTO();
		response.setMensagem("Cadastro com sucesso!");
		return response;
		}
	
	@PostMapping (path = "/estatistica/resumida")
	public ContatoResponseDTO resumida(@RequestBody ContatoRequestDTO request) {
		System.out.println(request.getIdade() + request.getNome() + request.getAltura());
		String nomeInvertido = request.getNome();
		int qtdCaracteres = request.getNome().length();
		ContatoResponseDTO response = new ContatoResponseDTO();
		response.setMensagem("o nome invertido é: " + new StringBuilder(nomeInvertido).reverse() 
				+ ", a quantidade de caracteres é: " + qtdCaracteres);		
		return response;
	}
	@PostMapping(path = "/estatistica/completa")
	public ContatoResponseDTO completa (@RequestBody ContatoRequestDTO request) {
		System.out.println(request.getIdade() + request.getNome() + request.getAltura());
		int qtdCaracteres = request.getNome().length();
		String nomeInvertido = request.getNome();
		long anobissexto = request.getIdade() / 4;
		long diasVividos = ((request.getIdade() * 365) + anobissexto);
		ContatoResponseDTO response = new ContatoResponseDTO();
		response.setMensagem("A quantidade de letras é: " + qtdCaracteres 
				+ ", o nome invertido é: "+ new StringBuffer(nomeInvertido).reverse() 
				+ ", a quantidade de dias vividos é: " + diasVividos);
		return response;
	}
}
