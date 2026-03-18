package view;

import controller.ListaEncadeadaSimplesController;

public class ListaEncadeadaSimples{
	public static void main(String[] args){
		ListaEncadeadaSimplesController crt = new ListaEncadeadaSimplesController();
		int[] array = {8, 4, 7, 1, 0, 3, 5, 2};

		try{
			System.out.println("Inserindo os elementos {8, 4, 7, 1, 0, 3, 5}...");

			for(int i = 0; i < array.length - 1; i++){
				crt.addNum(array[i]);
			}

			System.out.println("Sequência inserida!\n");
			
			System.out.println(crt.mostrarNums());

			System.out.println("\nOrdenando a lista...");
			crt.ordenarLista();

			System.out.println(crt.mostrarNums());

			System.out.println("\nInserindo o valor 2 na lista...");
			crt.addNumOrdenado(array[array.length - 1]);

			System.out.println("Número dois inserido!\n");

			System.out.println(crt.mostrarNums());

			System.out.println("\nConvertendo lista em array");
			array = crt.toArray();

			System.out.println("Informações do array criado: "+array);
			for(int i = 0; i < array.length; i++){
				System.out.println(array[i]+"\t");
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}
}