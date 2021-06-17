
public class Problem3 {
	Double arithmetic_dundaj(Double[] array, int n) {
		Double hariu = 0.0;
		for(int i=0; i<n; i++)
			hariu = hariu + array[i];
		return hariu / n;
	}
}
