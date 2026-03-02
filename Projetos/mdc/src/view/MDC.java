package view;

import controller.MDCController;
import java.util.Scanner;

public class MDC{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		MDCController obj = new MDCController();
		int x, y;

		System.out.println("Digite o valor de x: ");
		x = in.nextInt();
		
		System.out.println("Digite o valor de y: ");
		y = in.nextInt();

		System.out.println("MDC: " + obj.mdc(x, y));
	}
}