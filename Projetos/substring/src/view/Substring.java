package view;

import java.util.Scanner;
import controller.SubstringController;

public class Substring{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		SubstringController obj = new SubstringController();
		String palavra;

		System.out.println("Digite uma palavra: ");
		palavra = in.next();

		System.out.println("Palavra invertida: " + obj.inverter(palavra, palavra.length()));
	}
}