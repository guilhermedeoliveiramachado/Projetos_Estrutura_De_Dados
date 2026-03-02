package controller;

public class FatorialController{
	public FatorialController(){
		super();
	}

	public int calcular(int numero){
		int fatorial;
		
		if(numero<=1){
			return 1;
		}

		fatorial = numero * calcular(--numero);
		return fatorial;
	}
}