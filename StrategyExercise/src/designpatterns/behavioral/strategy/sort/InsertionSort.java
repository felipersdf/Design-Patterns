package designpatterns.behavioral.strategy.sort;

import strategy.pattern.Sort;

/**
 * Insertion Sort.
 * 
 * @author http://www.cs.princeton.edu/introcs/42sort/
 */

public class InsertionSort implements Sort{
	public void insertionSort(double[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++)
			for (int j = i; j > 0; j--)
				if (a[j] < a[j - 1])
					exch(a, j, j - 1);
				else
					break;
	}

	// exchange a[i] and a[j]
	private void exch(double[] a, int i, int j) {
		double swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	@Override
	public void Ordernar(double[] a) {
		this.insertionSort(a);
	}
}
