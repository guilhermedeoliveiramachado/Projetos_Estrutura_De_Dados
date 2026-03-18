package controller;

public class BubbleController{
	public BubbleController(){
		super();
	}

	public void ordenar(int[] vetor){
		bubble(vetor, 0, vetor.length - 1);
	}

	public void bubble(int[] vetor, int inicio, int fim){
		int aux;

		for(int i = inicio; i <= fim - 1; i++){
			for(int j = i+1; j <= fim; j++){
				if(vetor[i] >= vetor[j]){
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
	}
}