package Week3;

public class Problem22 {
	public String[] function(int too) {
		String[] hariu = new String[too];
		int temp;
		
		for(int i = 1; i <= too; i++) {
			temp = 1;
			for(int j = 1; j <= i; j++) {
				temp = temp * j;
			}
			hariu[i - 1] = i + "! = " + temp;
		}
		
		return hariu;
	}
}
