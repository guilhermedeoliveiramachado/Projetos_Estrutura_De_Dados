package model.estrutura;

import java.lang.Exception;
import model.estrutura.No;

public class ListaDupla<T>{
	private No<T> inicio = null;
	private No<T> fim = null;
	private int total = 0;

	//Adicionar nome já em ordem
	public void addNome(String nome){
		No<T> buffer = new No<>(nome);

		if(this.inicio == null){
			this.fim = buffer;
			this.inicio = buffer;
		}else{
			ordenar(buffer);
		}
	}

	public void ordenar(No<T> buffer){
		if(this.inicio.getValor().compareTo(buffer.getValor()) > 0){
			buffer.setProximo(this.inicio);
			this.inicio.setAnterior(buffer);
			this.inicio = buffer;
			return;
		}
		
		
		No<T> bufferLista = this.inicio;
		while(bufferLista != null){
			if(bufferLista.getProximo() != null &&  bufferLista.getProximo().getValor().compareTo(buffer.getValor()) > 0){
				No<T> ex_inicio = bufferLista;
				No<T> ex_ultimo = bufferLista.getProximo();
				ex_inicio.setProximo(buffer);
				buffer.setProximo(ex_ultimo);
				ex_ultimo.setAnterior(buffer);
				buffer.setAnterior(ex_inicio);
				
				break;
			}
			if(bufferLista.getProximo() == null){
				bufferLista.setProximo(buffer);
				buffer.setAnterior(bufferLista);
				this.fim = buffer;
				break;
			}
			bufferLista = bufferLista.getProximo();
		}
	}
	

	public int getTotal(){
		if(this.inicio == null){
			return 0;
		}

		No<T> buffer = this.inicio;
		int total_elementos = 0;
		
		do{
			total_elementos++;
			buffer = buffer.getProximo();
		}while(buffer != null);

		return total_elementos;
	}

	public void remove(String nome)throws IllegalArgumentException{
		if(getTotal() == 0){
			throw new IllegalArgumentException("Não há elementos na lista para remover!");
		}

		
		No<T> bufferLista = this.inicio;

		while(bufferLista != null){

				if(bufferLista.getValor().equalsIgnoreCase(nome)){
					if(bufferLista.getAnterior() == null){
						this.inicio = bufferLista.getProximo();
						if(this.inicio != null){
							this.inicio.setAnterior(null);
						}
					}else if(bufferLista.getProximo() == null){
						this.fim = bufferLista.getAnterior();
						this.fim.setProximo(null);
					}else{
						No<T> anterior = bufferLista.getAnterior();
						No<T> prox = bufferLista.getProximo();

						anterior.setProximo(prox);
						prox.setAnterior(anterior);
					}
					
				}
			
			bufferLista = bufferLista.getProximo();
		}
			
	}

	public String imprimir_asc(){
		if(this.inicio == null){
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");
		No<T> buffer = this.inicio;
		builder.append(buffer.getValor());

		while(buffer.getProximo() != null){
			builder.append(", ");
			buffer = buffer.getProximo();
			builder.append(buffer.getValor());
		}

		builder.append("]");
		return builder.toString();
	}

	public String imprimir_desc(){
		if(this.inicio == null){
			return "[]";
		}

		

		StringBuilder builder = new StringBuilder("[");
		No<T> buffer = this.fim;

		builder.append(buffer.getValor());

		while(buffer.getAnterior() != null){
			builder.append(", ");
			buffer = buffer.getAnterior();
			builder.append(buffer.getValor());
		}

		builder.append("]");
		return builder.toString();
	}
}