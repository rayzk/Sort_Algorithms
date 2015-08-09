package HeapSort;

import StandardLib.*;

public class Heap {

	// this class should not be instantiated.
	private Heap() {
	}

	public static void sort(Comparable[] pq) {
		int N = pq.length;
		for (int k = N / 2; k >= 1; k--) {
			sink(pq, k, N);
		}
		while (N > 1) {
			exch(pq, 1, N--);
			sink(pq, 1, N);
		}
	}
	
	/**
	 * Helper functions to restore the Heap invariant.
	 * @param pq
	 * @param k
	 * @param N
	 */
	private static void sink(Comparable[] pq, int k, int N) {
		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && less(pq, j, j + 1))
				j++;
			if (!less(pq, k, j))
				break;
			exch(pq, k, j);
			k = j;
		}
	}
	
	
	/*
	 * Helper functions for comparisons and swaps.
	 * Indices are "off-by-one" to support 1-based indexing.
	 */
	private static boolean less(Comparable[] pq, int i, int j){
		return pq[i-1].compareTo(pq[j-1]) < 0;
	}
	
	private static void exch (Object[] pq, int i, int j){
		Object swap = pq[i-1];
		pq[i-1] = pq[j-1];
		pq[j-1] = swap;
	}
	
	private static boolean less(Comparable v, Comparable w){
		return v.compareTo(w) < 0;
	}
	
	/*
	 * Check if array is sorted - useful for debugging.
	 */
	
	private static boolean isSorted (Comparable[] a){
		for (int i = 1; i < a.length; i++){
			if (less(a[i], a[i-1])) return false;
		}
		return true;
	}
	
	// print array to standard output.
	private static void show (Comparable[] a){
		for (int i = 0; i < a.length; i++){
			StdOut.println(a[i]);
		}
	}
	
	/**
	 * Reads in a sequence of strings from standard input; heapsorts them;
	 * and prints them to standard output in ascending order.
	 */
	
	public static void main (String[] args){
		String[] a = StdIn.readAllStrings();
		Heap.sort(a);
		show(a);
	}
	
	
	
	
}
