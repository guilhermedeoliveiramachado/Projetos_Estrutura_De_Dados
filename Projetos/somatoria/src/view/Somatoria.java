package view;

import controller.SomatoriaController;
import java.util.Scanner;

public class Somatoria{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		SomatoriaController obj = new SomatoriaController();
		int numero;

		System.out.println("Digite um número para calcular sua somatória de 1+1/2+1/3+...+1/N: ");
		numero = in.nextInt();

		System.out.println("Resultado: " + obj.somar(numero));
		
	}
}