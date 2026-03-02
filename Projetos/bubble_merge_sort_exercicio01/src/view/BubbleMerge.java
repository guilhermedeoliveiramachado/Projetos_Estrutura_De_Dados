package view;

import controller.BubbleMergeController;

public class BubbleMerge{
	public static void main(String[] args){
		BubbleMergeController obj = new BubbleMergeController();
		int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};

		System.out.println("Ordenação por bubble sort: "obj.ordernar_bubble(vetor));
		System.out.println("Ordenação por merge: "obj.ordernar_merge(vetor));
	}
}