package view;

import controller.ControllerListaDupla;
import java.util.Scanner;

public class ListaDuplaView{
	public static void main(String[] args){
		ControllerListaDupla crt = new ControllerListaDupla();
		int opcao = 0;
		String nome;
		Scanner in = new Scanner(System.in);

		do{
			try{
				System.out.println("Escolha sua opção:\n1 - Adicionar Pessoa\n2 - Remover Pessoa\n3 - Pegar total de elementos\n4 - Imprimir Ascendente\n5 - Imprimir Descrecente\n9 - Finalizar");
				opcao = in.nextInt();
				switch(opcao){
					case 1:
						System.out.println("Digite o nome da pessoa: ");
						nome = in.next();
						crt.adicionarPessoa(nome);
						break;
					case 2:
						System.out.println("Digite um nome para remover:");
						nome = in.next();
						crt.removerPessoa(nome);
						break;
					case 3:
						System.out.println("Total: "+crt.pegarTotal());
						break;
					case 4:
						System.out.println(crt.imprimirAsc());
						break;
					case 5:
						System.out.println(crt.imprimirDesc());
						break;
					case 9:
						System.out.println("Fim do programa");
						break;
					default:
						System.out.println("Opção inválida");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}while(opcao != 9);
	}
}