package view;

import controller.BinarioController;
import java.util.Scanner;

public class Binario{
	public static void main(String[] args){
		int num;
		Scanner in = new Scanner(System.in);
		BinarioController obj = new BinarioController();

		do{
			System.out.println("Digite um número:");
			num = in.nextInt();

			if(num > 2000){
				System.out.println("O número não deve ser maior que 2000");
			}
		}while(num > 2000);
		
		System.out.println("Número binário: " + obj.converter(num));
	}
}