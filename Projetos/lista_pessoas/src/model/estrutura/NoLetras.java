package model.estrutura;

import model.estrutura.NoPessoa;
import model.estrutura.ListaSimplesEstrutura;

public class NoLetras<T>{
	private String letra;
	private ListaSimplesEstrutura<T> valor;
	private NoLetras<T> anterior;
	private NoLetras<T> proximo;

	public NoLetras(String letra){
		this.valor = new ListaSimplesEstrutura();
		this.letra = letra;
		this.proximo = null;
		this.anterior = null;
	}

	public void setValor(ListaSimplesEstrutura valor){
		this.valor = valor;
	}
	
	public ListaSimplesEstrutura getValor(){
		return this.valor;
	}

	public void setLetra(String letra){
		this.letra = letra;
	}

	public String getLetra(){
		return this.letra;
	}

	public void setProximo(NoLetras<T> proximo){
		this.proximo = proximo;
	}

	public NoLetras<T> getProximo(){
		return this.proximo;
	}

	public void setAnterior(NoLetras<T> anterior){
		this.anterior = anterior;
	}

	public NoLetras<T> getAnterior(){
		return this.anterior;
	}

	@Override
	public String toString(){
		return this.letra.toString();
	}
}