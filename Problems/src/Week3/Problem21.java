package Week3;

public class Problem21 {
	public boolean function(int[] array, int too) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == too) {
				return true;
			}
		}
		return false;
	}
}
