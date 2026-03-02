package controller;

public class MultiplicacaoController{
	public MultiplicacaoController(){
		super();
	}

	public int multiplicar(int a, int b){
		if(b <= 1){
			return a;
		}else{
			return a+=multiplicar(a, --b);
			
		}
	}
}