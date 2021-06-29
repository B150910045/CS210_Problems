package Week3;

public class Problem24 {
	public int function(int too, int zereg) {
		int hariu = 0;
		
		for(int i = 0; i <= zereg; i++) {
			hariu = (int) (hariu + Math.pow(too, i));
		}
		
		return hariu;
	}
}
