package controller;

public class DigitoController{
	public DigitoController(){
		super();
	}
	
	public int contar_digitos(int num){
		int contDigitos = 1;

		if(num/10 <=0){
			return contDigitos;
		}

		contDigitos+=contar_digitos(num/10);
		return contDigitos;
	}
}