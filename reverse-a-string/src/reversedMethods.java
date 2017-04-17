public class reversedMethods {
	
	/* Brute Force Algorithm
	 * Time complexity - 
	 * Space complexity - 
	 * */
	public static String bruteForce(String s) {
		
		String reversed = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
}
	
	/* String Buffer Method
	 * Time Complexity -
	 * Space Complexity - 
	 **/
	public static String sbReverse (String s){
		
		return new StringBuilder(s).reverse().toString();
		
	}
	/* Found this on stack overflow
	 * Why does this work better than my brute force method
	 * Time Complexity - 
	 * Space Complexity - 
	 * */
	public static String reverse(String input){
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}

	
	
	
	
}