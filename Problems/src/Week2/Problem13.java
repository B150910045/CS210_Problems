package Week2;

public class Problem13 {
	public int function(int[] too) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i< too.length; i++) {
			if(too[i] <= min) {
				min = too[i];
			}
		}
		return min;
	}
}
