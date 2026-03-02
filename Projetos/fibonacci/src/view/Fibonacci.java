package view;

import java.util.Scanner;
import controller.FibonacciController;

public class Fibonacci{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		FibonacciController obj = new FibonacciController();
		
		int n;
		System.out.println("Digite o termo da série de Fibonacci:");
		n = in.nextInt();

		System.out.println("Resultado: " + obj.somar_serie(n));
	}
}