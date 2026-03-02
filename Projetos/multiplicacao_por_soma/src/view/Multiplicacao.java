package view;

import controller.MultiplicacaoController;
import java.util.Scanner;

public class Multiplicacao{
	public static void main(String[] args){
		int num1, num2;
		Scanner in = new Scanner(System.in);
		MultiplicacaoController obj = new MultiplicacaoController();

		System.out.println("Digite o valor de A: ");
		num1 = in.nextInt();
		
		System.out.println("Digite o valor de B: ");
		num2 = in.nextInt();

		System.out.println(num1 + "X" + num2 + " = " + obj.multiplicar(num1, num2));
	}
}