package view;

import controller.NumerosNaturaisController;
import java.util.Scanner;

public class NumerosNaturais{
	public static void main(String[] args){
		NumerosNaturaisController obj = new NumerosNaturaisController();
		Scanner in = new Scanner(System.in);
		int numero;

		System.out.println("Digite o número para a soma:");
		numero = in.nextInt();
		
		System.out.println("Soma dos " + numero + " números: "+obj.somar_numeros(numero));
	}
}