package checking;

import java.util.Scanner;

public class Testing {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		char[] charArray = s.toCharArray();
		
		int a = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (Character.isDigit(charArray[i])) {
				
				a = a + Integer.parseInt(String.valueOf(charArray[i]));
			}
		}
		
		System.out.println(a);
		
	}

}
