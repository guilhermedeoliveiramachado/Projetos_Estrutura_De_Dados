package controller;

public class SomatoriaController{
	public SomatoriaController(){
		super();
	}

	public double somar(int numero){
		double soma;

		if(numero > 1){
			soma = (1/(double)numero) + somar(--numero);
			return soma;
		}else{
			return 1;
		}
	}
}