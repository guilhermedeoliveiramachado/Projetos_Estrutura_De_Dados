package controller;

public class BubbleMergeController{
	public BubbleMergeController(){
		super();
	}

	public void ordernar_bubble(int[] vetor){
		int aux;

		for(int i = 0; i < vetor.length() - 1; i++){
			for(int j = i+1; j< vetor.length(); j++){
				if(vetor[j] <= vetor[i]){
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}

	public void ordenar_merge(int[] vetor){
		merge(vetor, 0, vetor.length() - 1);
		
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
		int poslivre, inicio_vetor1, inicio_vetor2;
		int aux[] = new int[vetor.length];
		
		inicio_vetor1 = inicio;
		inicio_vetor2 = meio + 1;
		poslivre = inicio;

		while(inicio_vetor1 <= meio && inicio_vetor2 <=fim){
			if(vetor[inicio_vetor1] <= vetor[inicio_vetor2]){
				aux[poslivre++] = vetor[inicio_vetor1++];
			}else{
				aux[poslivre++] = vetor[inicio_vetor2++];
			}
		}

		for(int i= inicio_vetor1; i <= meio; i++){
			aux[poslivre++] = vetor[i];
		}

		for(int i = inicio_vetor2; i <= fim; i++){
			aux[poslivre++] = vetor[i];
		}

		for(int i = inicio; i <= fim; i++){
			vetor[i] = aux[i];
		}
	}
}