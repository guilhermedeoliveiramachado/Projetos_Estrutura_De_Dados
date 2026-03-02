package view;

import controller.DigitoController;
import java.util.Scanner;

public class Digitos{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		DigitoController obj = new DigitoController();
		int num;

		System.out.println("Digite um número: ");
		num = in.nextInt();
		
		System.out.println("Quantidade de dígitos: " + obj.contar_digitos(num));
	}
}