package view;

import controller.ControllerListas;
import java.util.Scanner;

public class ListaPessoaView{
	public static void main(String[] args){
		ControllerListas crt = new ControllerListas();
		int opcao = 0;
		String nome, letra;
		Scanner in = new Scanner(System.in);

		do{
			try{
				System.out.println("Escolha sua opção:\n1 - Adicionar Pessoa\n2 - Remover letra\n3-Remover pessoa\n4-Mostrar Lista\n9-Finalizar");
				opcao = in.nextInt();
				switch(opcao){
					case 1:
						System.out.println("Digite o nome da pessoa: ");
						nome = in.next();
						crt.adicionarPessoa(nome);
						break;
					case 2:
						System.out.println("Digite a letra para remover:");
						letra = in.next();
						crt.removerLetra(letra);
						break;
					case 3:
						System.out.println("Digite o nome da pessoa para remover:");
						nome = in.next();
						crt.removerPessoa(nome);
						break;
					case 4:
						System.out.println(crt.mostrarLista());
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