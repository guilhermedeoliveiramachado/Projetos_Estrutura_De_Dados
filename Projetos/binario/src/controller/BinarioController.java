package controller;

public class BinarioController{
	public BinarioController(){
		super();
	}

	public String converter(int num){
		String s = "";
		int resto = 0;
	
		if(num > 0){
			resto = num%2;
			s = String.valueOf(resto);
			s = converter(num/2) + s;
		}

		return s;
	}

}