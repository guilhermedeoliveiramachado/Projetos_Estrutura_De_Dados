package view;

import controller.FatorialController;
import java.util.Scanner;

public class Fatorial{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		FatorialController fatorial = new FatorialController();
		int numero = 0;

		do{
			System.out.println("Digite o número de fatoração:");
			numero = in.nextInt();

			if(numero > 12)
				System.out.println("O número deve ser menor ou igual a 12.");

			if(numero <= 0)
				System.out.println("O número deve ser maior que 0.");
		}while(numero > 12 || numero <= 0);

		System.out.println("Fatorial de " + numero + ": " + fatorial.calcular(numero));
	}
}