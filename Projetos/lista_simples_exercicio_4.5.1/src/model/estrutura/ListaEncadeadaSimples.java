package model.estrutura;

import model.estrutura.No;
import model.estrutura.Pessoa;
import java.lang.Exception;

public class ListaEncadeadaSimples<T>{
	private No<T> inicio = null;
		
	public void append(String nome){
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.setNome(nome);
		
		No<T> buffer = new No<>(novaPessoa);
		
		if(this.inicio == null){
			this.inicio = buffer;
		}else{
			this.last().setProximo(buffer);
		}
	}
	
	
	public int getElemento(String nome)throws IllegalArgumentException{
		int index = 0;
		
		if(this.inicio == null){
			throw new IllegalArgumentException("Não pessoas na lista");
		}
		
		No<T> buffer = this.inicio;
		
		while(buffer != null){
			if(buffer.getPessoa().getNome().equalsIgnoreCase(nome)){
				return index;
			}
			index++;
			buffer = buffer.getProximo();
		}
		
		throw new IllegalArgumentException("Nao ha pessoa com esse nome!");
	}
	
	public No<T> get(int index) throws IllegalArgumentException{
		int i = 0;

		if(this.inicio == null){
			throw new IllegalArgumentException("Não existe item na lista.");
		}

		No<T> buffer = this.inicio;
		
		for(i = 0; i < index; i++){
			if(buffer.getProximo() == null){
				break;
			}
			buffer = buffer.getProximo();
		}

		if(i < index){
			throw new IllegalArgumentException("O índice informado não existe");

		
		}
		return buffer;
	}


	public void insert(int index, String nome) throws IllegalArgumentException{
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.setNome(nome);

		if(index == 0){
			No<T> buffer_novo = new No<>(novaPessoa);
			if(this.inicio != null){
				No<T> buffer_inicio = this.inicio;
				buffer_novo.setProximo(buffer_inicio);
				this.inicio = buffer_novo;
			}else{
				this.inicio = buffer_novo;
			}
		}else{
			this.insert(this.get(--index), novaPessoa);
		}
	}

	public void insert(No<T> item, Pessoa novaPessoa) throws IllegalArgumentException{
		No<T> buffer_novo = new No<>(novaPessoa);
		No<T> buffer_proximo = item.getProximo();
		item.setProximo(buffer_novo);
		buffer_novo.setProximo(buffer_proximo);
	}
	
	public No<T> last() throws IllegalArgumentException{
		if(this.inicio == null){
			throw new IllegalArgumentException("Não existe itens na lista.");
		}

		No<T> buffer = this.inicio;
		while(buffer.getProximo() != null){
			buffer = buffer.getProximo();
		}

		return buffer;
	}

	public void remove(int index){
		if(index == 0){
			this.inicio.setPessoa(null);
			
			if(this.inicio.getProximo() == null){
				this.inicio = null;
			}else{
				No<T> buffer = this.inicio.getProximo();
				this.inicio.setProximo(null);
				this.inicio = buffer;
			}

			return;
		}
		No<T> buffer_anterior = this.get(index - 1);
		No<T> item = buffer_anterior.getProximo();
		No<T> buffer_proximo = item.getProximo();
		buffer_anterior.setProximo(buffer_proximo);
		item.setProximo(null);
		item.setPessoa(null);
	}

	public int total(){
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

	@Override
	public String toString(){
		if(this.inicio == null){
			return "[]";
		}
		Pessoa pessoa;
		StringBuilder builder = new StringBuilder("[");
		No<T> buffer = this.inicio;
		builder.append(buffer.getPessoa().getNome());
		while(buffer.getProximo() != null){
			builder.append(",");
			buffer = buffer.getProximo();
			pessoa = buffer.getPessoa();
			builder.append(pessoa.getNome());
		}
		builder.append("]");
		return builder.toString();
	}
}