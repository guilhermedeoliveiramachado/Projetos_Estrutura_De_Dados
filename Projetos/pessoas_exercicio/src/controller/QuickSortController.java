package controller;

import model.Pessoa;

public class QuickSortController{
	public QuickSortController(){
		super();
	}

	public void ordenar_quick(Pessoa[] pessoas){
		quick(pessoas, 0, pessoas.length - 1);
	}

	public void quick(Pessoa[] pessoas, int inicio, int fim){
		if(fim > inicio){
			int indexPivo = dividir(pessoas, inicio, fim);
			quick(pessoas, inicio, indexPivo - 1);
			quick(pessoas, indexPivo + 1, fim);
		}
	}

	public int dividir(Pessoa[] pessoas, int inicio, int fim){
		Pessoa pivo = pessoas[inicio];
		int pontDir = fim, pontEsq = inicio + 1;
		
		while(pontEsq <= pontDir){
			while(pontEsq <= pontDir && pessoas[pontEsq].getSobrenome().compareTo(pivo.getSobrenome()) < 0){
				pontEsq++;
			}
			
			while(pontDir >= pontEsq && pessoas[pontDir].getSobrenome().compareTo(pivo.getSobrenome()) > 0){
				pontDir--;
			}

			if(pontEsq < pontDir){
				trocar(pessoas, pontDir--, pontEsq++);
			}
		}

		trocar(pessoas, inicio, pontDir);
		return pontDir;
	}

	public void trocar(Pessoa[] pessoas, int i, int j){
		Pessoa pessoaAux = pessoas[i];
		pessoas[i] = pessoas[j];
		pessoas[j] = pessoaAux;
	}
}