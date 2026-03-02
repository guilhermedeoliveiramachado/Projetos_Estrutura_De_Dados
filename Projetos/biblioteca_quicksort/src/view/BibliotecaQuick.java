package view;

import controller.BibliotecaQuickController;

public class BibliotecaQuick{
	public static void main(String[] args){
		int[] vetor = {44, 43, 42, 41, 40, 39, 38};
		
		BibliotecaQuickController obj = new BibliotecaQuickController();
		obj.ordenar(vetor);

		for(int = 0; i < vetor.length; i++){
			System.out.println(vetor[i]);
		}
	}
}