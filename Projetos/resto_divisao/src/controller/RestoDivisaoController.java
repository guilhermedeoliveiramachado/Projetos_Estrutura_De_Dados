package controller;

public class RestoDivisaoController{
	public RestoDivisaoController(){
		super();
	}
	
	public int resto_divisao(int dividendo, int divisor){
		int resto;

		if(dividendo < divisor){
			return dividendo;
		}
		resto = dividendo-divisor;
		return resto_divisao(resto, divisor); 
	}
}