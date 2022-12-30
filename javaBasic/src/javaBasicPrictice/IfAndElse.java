package javaBasicPrictice;

public class IfAndElse {

	public static void main(String[] args) {
		int a = 20; 
		if(a > 5 && a < 10) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

		
		
	/*write a program which will take a positive integer and print whether the integer is even or odd
	 */
	 
	int x=45;
	if(x % 2 == 0) {
		System.out.println("even");
	}else {
		System.out.println("odd");
	}
	
		
		
	/*write a program which will take a small latter alahabet and print whether the alphabet is vovel or 
	  consonant */
		
	char ch = 'k';
	if(ch == 'a'  || ch == 'e' || ch == 'i' ||ch == 'o' || ch =='u') {
		System.out.println("vovel");
	}else {
		System.out.println("consonant");
	}
		
		
			
	}	

}
