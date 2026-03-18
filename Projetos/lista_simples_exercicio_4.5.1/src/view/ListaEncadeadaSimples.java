package view;

import controller.ListaEncadeadaSimplesController;
import java.util.Scanner;

public class ListaEncadeadaSimples{
	public static void main(String[] args){
		ListaEncadeadaSimplesController crt = new ListaEncadeadaSimplesController();
		int opcao = 0, index = 0;
		String nome;
		Scanner in = new Scanner(System.in);

		do{
			try{
				System.out.println("Escolha sua opção:\n1 - Adicionar Pessoa\n2 - Inserir Pessoa\n3 - Pegar total de elementos\n4-Remover pessoa\n5-Pegar Pessoa\n6-Pegar ultima pessoa\n7-Pegar pessoa pelo index\n8-Mostrar Pessoas\n9-Finalizar");
				opcao = in.nextInt();
				switch(opcao){
					case 1:
						System.out.println("Digite o nome da pessoa: ");
						nome = in.next();
						crt.addPessoa(nome);
						break;
					case 2:
						System.out.println("Digite um nome da pessoa:");
						nome = in.next();
						System.out.println("Digite o index:");
						index = in.nextInt();
						crt.addPessoa(index, nome);
						break;
					case 3:
						System.out.println("Total: "+crt.total());
						break;
					case 4:
						System.out.println("Informe o index do elemento que quer remover:");
						index = in.nextInt();
						crt.remover(index);
						break;
					case 5:
						System.out.println("Digite o nome da pessoa para buscar:");
						nome = in.next();
						System.out.println(crt.getPessoa(nome));
						break;
					case 6:
						System.out.println(crt.pegarUltimaPessoa());
						break;
					case 7:
						System.out.println("Digite o index da pessoa:");
						index = in.nextInt();
						System.out.println(crt.pegarElemento(index));
						break;
					case 8:
						System.out.println(crt.mostrarPessoas());
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