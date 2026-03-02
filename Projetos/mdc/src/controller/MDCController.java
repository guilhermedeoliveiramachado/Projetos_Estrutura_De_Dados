package controller;

public class MDCController{
	public MDCController(){
		super();
	}

	public int mdc(int x, int y){
		int mult = 1;
		
		if(x != 1 && y != 1){
			int numDiv = procurar_num_primo(y);
			
			if(x%numDiv == 0 && y%numDiv == 0){
				mult = numDiv * mdc(x/numDiv, y/numDiv);
			}else if(x%numDiv == 0 && y%numDiv != 0){
				mult = mdc(x/numDiv, y);
			}else{
				mult = mdc(x, y/numDiv);
			}
		}
		
		return mult;
	}

	public int procurar_num_primo(int num){
		boolean ePrimo= true;
		int i = 2;

		while(i < num){
			for(int j = 2; j < i; j++){
				if(i%j == 0){
					ePrimo = false;
					break;
				}
			}
			if(ePrimo){
				if(num%i == 0){
					break;
				}
			}
			i++;
		}

		return i;
	}
}