package controller;

public class BibliotecaController{
	public BibliotecaController(){
		super();
	}

	public String[] ordenar(String[] vetor){
		String aux;
		
		for(int i = 0; i <= vetor.length - 1; i++){
			for(int j = i+1; j < vetor.length; j++){
				if(vetor[i].compareTo(vetor[j]) > 0){
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
		return vetor;
	}
}