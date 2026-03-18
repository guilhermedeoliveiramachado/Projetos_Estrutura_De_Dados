package controller;

import java.io.*;
import controller.BubbleController;
import controller.MergeController;
import controller.QuickController;

public class TempoController{
	public TempoController(){
		super();
	}

	public long calcular_tempo_quick(int[] vetor){
		QuickController quick = new QuickController();
		long tempoInicial = System.nanoTime();
		
		quick.ordenar(vetor);

		long tempoFinal = System.nanoTime();

		return converter_milisegundos(tempoInicial, tempoFinal);
		
	}

	public long calcular_tempo_merge(int[] vetor){
		MergeController merge = new MergeController();
		long tempoInicial = System.nanoTime();
		
		merge.ordenar(vetor);

		long tempoFinal = System.nanoTime();

		return converter_milisegundos(tempoInicial, tempoFinal);
		
	}

	public long calcular_tempo_bubble(int[] vetor){
		BubbleController bubble = new BubbleController();
		long tempoInicial = System.nanoTime();
		
		bubble.ordenar(vetor);

		long tempoFinal = System.nanoTime();

		return converter_milisegundos(tempoInicial, tempoFinal);
	}

	public long converter_milisegundos(long tempoInicial, long tempoFinal){
		long tempoExecucao;

		tempoExecucao = (tempoFinal - tempoInicial)/1000000;

		return tempoExecucao;
	}
}