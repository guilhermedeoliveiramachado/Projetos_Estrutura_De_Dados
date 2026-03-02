package view;

import controller.NumerosNegativosController;

public class NumerosNegativos{
	public static void main(String[] args){
		int[] vetor = {-1, 4, -43, 22, 55, -11};
		NumerosNegativosController obj = new NumerosNegativosController();

		System.out.println("Número de quantidade de números negativos no array: " + obj.mostrar_qtdd_num_negativos(vetor, vetor.length));
	}
}