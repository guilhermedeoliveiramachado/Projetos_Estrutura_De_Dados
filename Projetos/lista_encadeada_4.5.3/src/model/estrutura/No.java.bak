package model.estrutura;

import model.estrutura.Pessoa;

public class No<T> {
	private Pessoa pessoa;
	private No<T> proximo;

	public No(Pessoa pessoa){
		this.proximo = null;
		this.pessoa = pessoa;
	}
	
	public No(Pessoa pessoa, No<T> proximo){
		this.proximo = proximo;
		this.pessoa = pessoa;
	}
	
	public Pessoa getPessoa(){
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa){
		this.pessoa = pessoa;
	}

	public No<T> getProximo(){
		return this.proximo;
	}

	public void setProximo(No<T> proximo){
		this.proximo = proximo;
	}

	@Override
	public String toString(){
		return pessoa.getNome().toString();
	}
}