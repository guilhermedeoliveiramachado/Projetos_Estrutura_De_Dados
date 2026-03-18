package controller;

public class NumerosNaturaisController{
	public NumerosNaturaisController(){
		super();
	}

	public int somar_numeros(int numero){
		int soma;
		if(numero<0){
			return 0;
		}else {
			if(numero >= 1){
				soma = numero + somar_numeros(--numero);
				return soma;	
			}else {
				return numero;
			}
		}
	}
}