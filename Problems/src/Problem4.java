
public class Problem4 {
	Boolean usuh_eseh(int[] array, int hemjee) {
		for(int i = 0; i<hemjee - 1; i++) {
			if(array[i] > array[i + 1])
				return false;
		}
		return true;
	}
}
