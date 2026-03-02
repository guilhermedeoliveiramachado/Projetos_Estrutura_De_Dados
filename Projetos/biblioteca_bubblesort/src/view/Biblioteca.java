package view;

import controller.BibliotecaController;

public class Biblioteca{
	public static void main(String[] args){
		BibliotecaController obj = new BibliotecaController();
		String[] nomes = {"Harry Potter", "A culpa é das estrelas", "Pequeno príncipe", "Dom Quixote"};

		nomes = obj.ordenar(nomes);
		for(int i = 0; i < nomes.length; i++){
			System.out.println(nomes[i]);
		}
	}
}