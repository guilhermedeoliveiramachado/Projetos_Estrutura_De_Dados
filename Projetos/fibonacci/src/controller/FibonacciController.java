package controller;

public class FibonacciController{
	public FibonacciController(){
		super();
	}

	public int somar_serie(int n){
		int soma;

		if(n == 1 || n == 2){
			return 1;
		}
		
		soma = somar_serie(n-1) + somar_serie(n-2);
		return soma;
		
	}
}