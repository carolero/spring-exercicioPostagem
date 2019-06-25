package com.br.monitoria.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.monitoria.models.PostagemModel;
import com.br.monitoria.services.PostagemService;

@Controller
public class PostagemController {
	
	@Autowired
	PostagemService postagemService;
	
	@RequestMapping("/adicionar")
	@ResponseBody
	public String adicionarPostagens() {
		postagemService.adicionarPostagens();
		return "Adicionado";
	}
	
	@RequestMapping
	@ResponseBody
	public Map<Integer, PostagemModel> mostrarPostagens() {
		return postagemService.mostrarPostagens();
	}
	
	@RequestMapping("/postagem/{id}")
	@ResponseBody
	public PostagemModel buscarPostagem(@PathVariable int id) {
		return postagemService.buscarPostagem(id);
	}
	
	@RequestMapping("/delete/{id}")
	@ResponseBody
	public PostagemModel deletePostagemModel(@PathVariable int id) {
		return postagemService.deletePostagem(id);
	}
}
