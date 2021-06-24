package Week2;

public class Problem12 {
	int function(int too) {
		int count = 0;
		String str_too = Integer.toString(too);
		char[] chars = str_too.toCharArray();
		for(int i = 0; i< chars.length; i++) {
			if(chars[i] % 2 == 1) {
				count++;
			}
		}	
		return count;
	}
}
