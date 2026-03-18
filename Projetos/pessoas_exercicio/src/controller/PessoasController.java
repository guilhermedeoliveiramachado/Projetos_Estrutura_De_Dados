package controller;

import java.io.*;
import model.Pessoa;
import controller.QuickSortController;

public class PessoasController{
	public PessoasController(){
		super();
	}

	public Pessoa[] ordenar_sobrenome()throws IOException{
		Pessoa[] pessoas = Pessoa.carregar();
		QuickSortController quick = new QuickSortController();

		quick.ordenar_quick(pessoas);

		return pessoas;
	}

}