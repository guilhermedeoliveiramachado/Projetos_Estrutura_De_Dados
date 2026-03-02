package view;

import java.util.Scanner;
import controller.SerieFatorialController;

public class SerieFatorial{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		SerieFatorialController obj = new SerieFatorialController();
		int num;
		
		System.out.println("Digite um número para a somatória de 1+1/2!+1/3!...+1/N!");
		num = in.nextInt();
		
		System.out.println("Resultado da serie: " + obj.somar_serie(num));
	}
}