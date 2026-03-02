package view;

import controller.ArrayController;

public class Array{
	public static void main(String[] args){
		int[] vetor = {10, 3, 2, 7, 5};
		ArrayController obj = new ArrayController();

		System.out.println("Menor valor encontrado: " + obj.pegar_num_menor(vetor, vetor.length - 1, vetor[vetor.length - 1]));
	}
}