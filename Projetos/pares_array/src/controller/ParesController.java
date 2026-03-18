package controller;

public class ParesController{
	public ParesController(){
		super();
	}

	public int contar_pares(int[] vetor, int tamArray){
		int cont = 0;
		
		if(tamArray - 1 >= 0){
			if(vetor[tamArray - 1] % 2 == 0){
				cont = 1;
			}
			cont+=contar_pares(vetor, --tamArray);
		}
		
		return cont;
		
	}
}