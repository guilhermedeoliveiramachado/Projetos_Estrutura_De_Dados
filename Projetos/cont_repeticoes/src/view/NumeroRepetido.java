package view;

import java.util.Scanner;
import controller.NumeroRepetidoController;

public class NumeroRepetido{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		NumeroRepetidoController obj = new NumeroRepetidoController();
		int num1, num2;

		do{
			System.out.println("Digite um número entre 10 e 999999");
			num1 = in.nextInt();
			
			if(num1 < 10 || num1 >999999){
				System.out.println("Número inválido");
			}
		}while(num1 < 10 || num1 >999999);

		do{
			System.out.println("Digite um número entre 0 e 9");
			num2 = in.nextInt();
			
			if(num2 < 0 || num2 >9){
				System.out.println("Número inválido");
			}
		}while(num2 < 0 || num2 >9);

		System.out.println("O número " + num2 + " aparece " + obj.contar_numero(num1, num2)+ " vezes.");
	}
}