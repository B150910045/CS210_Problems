
public class Problem5 {
	Boolean armstrong_too(int too) {
		String string = Integer.toString(too);
		String[] stringArray = string.split("");
		int length = stringArray.length;
		int[] intArray = new int[length];
		
		int sum = 0;
		for(int i=0; i<length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
			sum = (int) (sum + Math.pow(intArray[i], length));
		}
		
		if(too == sum)
			return true;
		else 
			return false;
	}
}
