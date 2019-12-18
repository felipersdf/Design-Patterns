package strategy.pattern;

import java.util.Random;

import designpatterns.behavioral.strategy.sort.BubbleSort;
import designpatterns.behavioral.strategy.sort.InsertionSort;
import designpatterns.behavioral.strategy.sort.MergeSort;
import designpatterns.behavioral.strategy.sort.QuickSort;

public class Main {

	public static void main(String[] args) {
		
		double exemplo[] = new double[1000];
		double exemplo2[] = new double[1000];;
		double exemplo3[] = new double[1000];;
		double exemplo4[] = new double[1000];;
		
		for(int i = 0; i < 1000; i++) {
			Random r = new Random();
			exemplo[i] = r.nextDouble();
			exemplo2[i] = r.nextDouble();
			exemplo3[i] = r.nextDouble();
			exemplo4[i] = r.nextDouble();
		}
		
		
		
		long tempoInicio = System.currentTimeMillis();
		System.out.println("Bubble Sort:");
		Sort S = new BubbleSort();
		S.Ordernar(exemplo4);
		long tempoFinal = System.currentTimeMillis();
		long tempoTotal = tempoFinal - tempoInicio;
		System.out.println(tempoTotal);

	
		long tempoInicio2 = System.currentTimeMillis();
		System.out.println("Insertion Sort:");
		Sort I = new InsertionSort();
		I.Ordernar(exemplo3);
		long tempoFinal2 = System.currentTimeMillis();
		long tempoTotal2 = tempoFinal2 - tempoInicio2;
		System.out.println(tempoTotal2);

		long tempoInicio3 = System.currentTimeMillis();
		System.out.println("Quick Sort:");
		Sort Q = new QuickSort();
		Q.Ordernar(exemplo2);
		long tempoFinal3 = System.currentTimeMillis();
		long tempoTotal3 = tempoFinal3 - tempoInicio3;
		System.out.println(tempoTotal3);
		
		long tempoInicio4 = System.currentTimeMillis();
		System.out.println("Merge Sort:");
		Sort M = new MergeSort();
		M.Ordernar(exemplo);
		long tempoFinal4 = System.currentTimeMillis();
		long tempoTotal4 = tempoFinal3 - tempoInicio3;
		System.out.println(tempoTotal4);

	}

}
