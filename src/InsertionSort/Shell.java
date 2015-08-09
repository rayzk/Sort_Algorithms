package InsertionSort;

import StandardLib.StdIn;
import StandardLib.StdOut;

public class Shell {

	private Shell() {
	}

	/**
	 * Rearrange the array in ascending order, using the natural order.
	 * 
	 * @param a
	 *            the array to be sorted.
	 */
	public static void sort(Comparable[] a) {
		int N = a.length;

		// 3x+1 increment sequence: 1, 4, 13, 40, 121, ...
		int h = 1;
		while (h < N / 3)
			h = 3 * h + 1;
		while (h >= 1) {
			// h-sort the array.
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
					exch(a, j, j - h);
				}
			}
			assert isHsorted(a, h);
			h /= 3;
		}
		assert isSorted(a);
	}

	/****************************************************************
	 * Helper sorting functions.
	 ****************************************************************/
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static void exch(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	/****************************************************************
	 * Check if array is sorted - useful for debugging.
	 ****************************************************************/
	private static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i - 1]))
				return false;
		}
		return true;
	}

	private static boolean isHsorted(Comparable[] a, int h) {
		for (int i = h; i < a.length; i++)
			if (less(a[i], a[i - h]))
				return false;
		return true;
	}

	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.println(a[i]);
		}
	}

	/**
	 * Reads in a sequence of strings from standard input; Shellsorts them; and
	 * prints them to standard output in ascending order.
	 */
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		Shell.sort(a);
		show(a);
	}

}
