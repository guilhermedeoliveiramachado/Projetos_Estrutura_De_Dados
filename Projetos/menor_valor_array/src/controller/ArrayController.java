package controller;

public class ArrayController{
	public ArrayController(){
		super();
	}

	public int pegar_num_menor(int[] vetor, int tamVetor, int valorMenor){
		if(tamVetor >= 1){
			if(vetor[tamVetor - 1] <= valorMenor)
				valorMenor = vetor[tamVetor - 1];

			return pegar_num_menor(vetor, --tamVetor, valorMenor);
		}else{
			return valorMenor;
		}
	}
}