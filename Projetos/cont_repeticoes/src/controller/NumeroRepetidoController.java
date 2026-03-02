package controller;

public class NumeroRepetidoController{
	public NumeroRepetidoController(){
		super();
	}

	public int contar_numero(int num1, int num2){
		int cont = 0;

		if(num1 == 0){
			return cont;
		}

		if(num1%10 == num2){
			cont = 1;
		}
		cont+=contar_numero(num1/10, num2);
		return cont;
	}
}