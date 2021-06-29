package Week3;

public class Problem25 {
	public Double function(Double too) {
		Double hariu = 1.0;
		
		for(Double i = 1.0; i <= too; i++) {
			hariu = hariu * (1 + 1 / (i * i));
		}
		
		return hariu;
	}
}
