package view;

import controller.PessoasController;
import model.Pessoa;

public class Pessoas{
	public static void main(String[] args){
		try{
			PessoasController obj = new PessoasController();
			Pessoa[] pessoas = obj.ordenar_sobrenome();
			
			for(int i=0; i < pessoas.length; i++){
				System.out.println(pessoas[i].toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}