package controller;

import model.estrutura.ListaEncadeadaSimples;
import model.estrutura.No;

public class ListaEncadeadaSimplesController{
	private ListaEncadeadaSimples lista;
	
	public ListaEncadeadaSimplesController(){
		this.lista = new ListaEncadeadaSimples();
	}
	
	public void ordenarLista(){
		ListaEncadeadaSimples novaLista = new ListaEncadeadaSimples();
		int totalElementos = lista.total();

		for(int i = 0; i < totalElementos; i++){
			int valor = lista.get(i).getNum();
			novaLista.inserirOrdenado(valor);
		}

		this.lista = novaLista;
	}

	public void addNum(int num){
		this.lista.append(num);
	}

	public void addNumOrdenado(int num){
		this.lista.inserirOrdenado(num);
	}

	public int[] toArray(){
		return this.lista.toArray();
	}
	
	public String mostrarNums(){
		return "Lista Números: "+this.lista.toString();
	}
}