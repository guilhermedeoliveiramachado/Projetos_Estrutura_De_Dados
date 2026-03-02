package view;

import java.util.Scanner;
import controller.RestoDivisaoController;

public class RestoDivisao{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		RestoDivisaoController obj = new RestoDivisaoController();
		int dividendo, divisor;

		System.out.println("Digite o dividendo:");
		dividendo = in.nextInt();
		
		System.out.println("Digite o divisor:");
		divisor = in.nextInt();

		System.out.println("Resto da divisão: " + obj.resto_divisao(dividendo, divisor));
	}
}