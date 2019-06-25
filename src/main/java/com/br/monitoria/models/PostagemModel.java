package com.br.monitoria.models;

public class PostagemModel {
	
	private String usuario;
	private String postagem;
	
	public PostagemModel() {
		
	}
	
	public PostagemModel(String usuario, String postagem) {
		this.usuario = usuario;
		this.postagem = postagem;
	}
	
	public String getPostagem() {
		return postagem;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}
	
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("\nUsuário: " + this.usuario);
		modelo.append("\nPostou: " + this.postagem);
		
		return modelo.toString();
	}

}
