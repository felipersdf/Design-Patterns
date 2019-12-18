package designpatterns.behavioral.strategy.sort;

import strategy.pattern.Sort;

/**
 * BubbleSort.
 * 
 * */

public class BubbleSort implements Sort {
	public void bubbleSort(double[] a, int n)
	// Precondition: a is array to be sorted of length n
	// Postcondition: The list a[0], a[1], ..., a[n-1] is sorted in increasing order.
	// This version sorts using bubble sort.
	{
		for (int i = n - 1; i > 0; i--) {
			// The next two lines are just for demonstration purposes.
			// Remove them in a real bubble sort implementation.
			// System.out.println("Before iteration for i = " + i + ":");
			// IntIO.writeInts(a, n);

			// Bubble the largest element to the end of a[0], ..., a[i].

			for (int j = 0; j < i; j++)
				if (a[j] > a[j + 1]) {
					double temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		}
	}

	@Override
	public void Ordernar(double[] a) {
		this.bubbleSort(a, a.length);
	}


}