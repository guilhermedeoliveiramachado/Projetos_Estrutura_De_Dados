package controller;

import model.estrutura.ListaDupla;
import model.estrutura.No;

public class ControllerListaDupla{
	private ListaDupla lista;

	public ControllerListaDupla(){
		this.lista = new ListaDupla();
	}

	public void adicionarPessoa(String nome)throws Exception{
		lista.addNome(nome);
	}
	
	public void removerPessoa(String nome)throws Exception{
		lista.remove(nome);
	}

	public int pegarTotal(){
		return lista.getTotal();
	}

	public String imprimirAsc(){

		return lista.imprimir_asc();
	}

	public String imprimirDesc(){

		return lista.imprimir_desc();
	}
}