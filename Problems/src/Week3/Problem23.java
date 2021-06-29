package Week3;

public class Problem23 {
	public int function(int too) {
		int sond, hariu = 1;
		if(too % 2 == 1)
			sond = 1;
		else 
			sond = 2;
		
		for(int i = sond; i <= too; i = i + 2) {
			hariu = hariu * i;
		}
		
		return hariu;
	}
}
