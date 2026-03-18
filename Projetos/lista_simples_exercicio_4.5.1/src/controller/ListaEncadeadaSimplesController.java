package controller;

import model.estrutura.ListaEncadeadaSimples;
import model.estrutura.No;

public class ListaEncadeadaSimplesController<T>{
	private ListaEncadeadaSimples lista;
	
	public ListaEncadeadaSimplesController(){
		this.lista = new ListaEncadeadaSimples();
	}
	
	public void addPessoa(String nome){
		this.lista.append(nome);
	}
	
	public void addPessoa(int index, String nome){
		this.lista.insert(index, nome);
	}
	
	public int getPessoa(String nome){
		return this.lista.getElemento(nome);
	}
	
	public void remover(int index){
		this.lista.remove(index);
	}
	
	public String pegarUltimaPessoa(){
		No<T> no = this.lista.last();
		return no.getPessoa().getNome();
	}
	
	public String pegarElemento(int index){
		No<T> no = this.lista.get(index);
		return no.getPessoa().getNome();
	}
	
	public int total(){
		return this.lista.total();
	}
	
	public String mostrarPessoas(){
		return this.lista.toString();
	}
}