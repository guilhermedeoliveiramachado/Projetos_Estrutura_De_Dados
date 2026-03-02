package controller;

public class SubstringController{
	public SubstringController(){
		super();
	}
		
	public String inverter(String palavra, int tamPalavra){
		String caracter = "";

		if(tamPalavra - 1 < 0){
			return caracter;
		}

		caracter = palavra.substring(tamPalavra - 1, tamPalavra);
		caracter = caracter + inverter(palavra, --tamPalavra);

		return caracter;
	}
}