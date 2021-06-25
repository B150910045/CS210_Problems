package Week2;

public class Problem15 {
	
	public int function(int too) {
		int niilber = 0;
		String str_too = Integer.toString(too);
		char[] chars = str_too.toCharArray();
		
		for(int i = 0; i < chars.length; i++) {
			String temp = Character.toString(chars[i]);
			niilber = niilber + Integer.parseInt(temp);
		}
		
		return niilber;
	}
}
