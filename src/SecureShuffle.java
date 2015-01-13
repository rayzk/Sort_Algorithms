import java.security.SecureRandom;

public class SecureShuffle {
	public static void main (String[] args){

		String[] a = StdIn.readAllStrings();
		int N = a.length;

		SecureRandom random = new SecureRandom();
		Double[] r = new Double[N];
		for (int i = 0; i < N; i++){
			r[i] = random.nextDouble();
		}

		int[] index = mergeSort.indexSort(r);

		for (int i = 0; i < N; i++){
			StdOut.println(a[index[i]]);
		}
	}
}