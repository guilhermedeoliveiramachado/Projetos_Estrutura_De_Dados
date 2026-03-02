package controller;

public class NumerosNegativosController{
	public NumerosNegativosController(){
		super();
	}

	public int mostrar_qtdd_num_negativos(int[] vetor, int tamVetor){
		int cont = 0;
		
		if(tamVetor - 1 >= 0){
			if(vetor[tamVetor - 1] < 0)
				cont = 1;
			cont+=mostrar_qtdd_num_negativos(vetor, --tamVetor);
		}
		
		return cont;

	}
}