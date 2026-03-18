package controller;

public class MergeController{
	public MergeController(){
		super();
	}

	public void ordenar(int[] vetor){
		merge(vetor, 0, vetor.length - 1);
	}

	public void merge(int[] vetor, int inicio, int fim){
		int meio;

		if(inicio < fim){
			meio = (inicio+fim)/2;
			merge(vetor, inicio, meio);
			merge(vetor, meio + 1, fim);
			intercala(vetor, inicio, fim, meio);
		}
	}

	public void intercala(int[] vetor, int inicio, int fim, int meio){
		int indexLivre = inicio, index_vetor1 = inicio, index_vetor2 = meio + 1;
		int[] aux = new int[vetor.length];

		while(index_vetor1 <= meio && index_vetor2 <= fim){
			if(vetor[index_vetor1] <= vetor[index_vetor2]){
				aux[indexLivre++] = vetor[index_vetor1++];
			}else{
				aux[indexLivre++] = vetor[index_vetor2++];
			}
		}
		
		for(int i = index_vetor1; i <= meio; i++){
			aux[indexLivre++] = vetor[i];
		}

		for(int i = index_vetor2; i <= fim; i++){
			aux[indexLivre++] = vetor[i];
		}

		for(int i = inicio; i <= fim; i++){
			vetor[i] = aux[i];
		}
	}
}