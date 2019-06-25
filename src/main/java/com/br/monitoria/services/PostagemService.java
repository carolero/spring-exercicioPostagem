package com.br.monitoria.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.br.monitoria.models.PostagemModel;

@Service
public class PostagemService {

	private Map<Integer, PostagemModel> postagens = new HashMap<Integer, PostagemModel>();
	
	public void adicionarPostagens() {
		postagens.put(1, new PostagemModel("Homem aranha", "Você não pode ser o Homem-Aranha amigo da vizinhança se não existir vizinhança."));
		postagens.put(2, new PostagemModel("Loki", "Eu lhe asseguro, irmão, o sol vai brilhar em nós novamente."));
		postagens.put(3, new PostagemModel("Thor", "A raiva e a vingança, a fúria, a perda, o ressentimento, são todos motivadores tremendos."));
	}
	
	public Map<Integer, PostagemModel> mostrarPostagens() {
		return this.postagens;
	}
	
	public PostagemModel buscarPostagem(int id) {
		return this.postagens.get(id);
	}
	
	public PostagemModel deletePostagem(int id) {
		return this.postagens.remove(id);
	}

}
