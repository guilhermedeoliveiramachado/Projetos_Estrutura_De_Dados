package controller;

public class SerieFatorialController{
	public SerieFatorialController(){
		super();
	}

	public double somar_serie(int num){
		double soma;
		int fatorial;

		if(num > 1){
			fatorial = fatorial(num);
			soma = 1/(double)fatorial + somar_serie(--num); 
			return soma;
		}else{
			return 1;
		}
		
	}

	public int fatorial(int num){
		int fatorial;

		if(num > 1){
			fatorial = num * fatorial(--num);
			return fatorial;
		}else{
			return 1;
		}
	}
}