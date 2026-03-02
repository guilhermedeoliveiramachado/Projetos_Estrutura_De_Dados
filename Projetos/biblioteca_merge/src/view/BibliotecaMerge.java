package view;

import controller.BibliotecaMergeController;

public class BibliotecaMerge{
	public static void main(String[] args){
		BibliotecaMergeController obj = new BibliotecaMergeController();
		String[] nomes = {"Harry Potter", "A culpa é das estrelas", "Pequeno Príncipe", "Dom Quixote"};

		obj.ordenar(nomes);
	
		for(int i = 0; i < nomes.length; i++){
			System.out.println(nomes[i]);
		}
	}
}