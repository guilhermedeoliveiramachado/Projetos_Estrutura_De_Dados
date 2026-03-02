package controller;

public class FatorialDuploController{
	public FatorialDuploController(){
		super();
	}

	public int calcular_fatorial(int numFatorial){
		int fatorial;

		if(numFatorial > 1){
			if(numFatorial % 2 != 0){
				fatorial = numFatorial * calcular_fatorial(--numFatorial);
				return fatorial;
			}
			return calcular_fatorial(--numFatorial);
		}else{
			return 1;
		}
	}
}