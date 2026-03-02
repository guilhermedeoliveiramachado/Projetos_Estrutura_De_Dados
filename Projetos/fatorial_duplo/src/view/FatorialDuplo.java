package view;

import java.util.Scanner;
import controller.FatorialDuploController;

public class FatorialDuplo{
	public static void main(String[] args){
		int num;
		Scanner in = new Scanner(System.in);
		FatorialDuploController obj = new FatorialDuploController();

		do{
			System.out.println("Digite um número ímpar: ");
			num = in.nextInt();

			if(num % 2 == 0)
				System.out.println("O número não deve ser par!");
		}while(num % 2 == 0);
		
		System.out.println(num + "!! = " +obj.calcular_fatorial(num));
	}
}