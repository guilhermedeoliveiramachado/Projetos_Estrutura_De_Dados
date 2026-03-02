package controller;

public class BibliotecaMergeController{
	public BibliotecaMergeController(){
		super();
	}

	public void ordenar(String[] nomes){
		merge(nomes, 0, nomes.length - 1);
	}

	public void merge(String[] nomes, int inicio, int fim){
		int meio;
		
		if(inicio < fim){
			meio = (inicio+fim)/2;
			merge(nomes, inicio, meio);
			merge(nomes, meio + 1, fim);
			intercala(nomes, inicio, fim, meio);
		}
	}

	public void intercala(String[] nomes, int inicio, int fim, int meio){
		int indexLivre = inicio, index_vetor1 = inicio, index_vetor2 = meio + 1;
		String[] vetor_aux = new String[nomes.length];

	while(index_vetor1 <= meio && index_vetor2<=fim){
		if(nomes[index_vetor1].compareTo(nomes[index_vetor2]) > 0){
			vetor_aux[indexLivre++] = nomes[index_vetor2++];
		}else{
			vetor_aux[indexLivre++] = nomes[index_vetor1++];
		}
	}

	for(int i = index_vetor1; i <= meio; i++){
		vetor_aux[indexLivre++] = nomes[index_vetor1];
	}

	for(int i = index_vetor2; i <= fim; i++){
		vetor_aux[indexLivre++] = nomes[index_vetor2];
	}

	for(int i = inicio; i <= fim; i++){
		nomes[i] = vetor_aux[i];
	}

		
	}
}