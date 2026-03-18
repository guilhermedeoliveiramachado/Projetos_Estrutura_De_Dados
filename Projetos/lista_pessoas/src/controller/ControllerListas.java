package controller;

import model.estrutura.ListaDuplaEstrutura;
import model.estrutura.ListaSimplesEstrutura;

public class ControllerListas{
    private ListaDuplaEstrutura listaDupla;
    
    public ControllerListas(){
        this.listaDupla = new ListaDuplaEstrutura();
    }

    public void adicionarLetra(String letra){
        listaDupla.addLetra(letra);
    }

    public void adicionarPessoa(String nome){
        listaDupla.addPessoa(nome);
    }

    public void removerLetra(String letra){
        listaDupla.remove(letra);
    }

    public void removerPessoa(String nome){
        listaDupla.removerElementoLista(nome);
    }

    public String mostrarLista(){
        return listaDupla.toString();
    }
}