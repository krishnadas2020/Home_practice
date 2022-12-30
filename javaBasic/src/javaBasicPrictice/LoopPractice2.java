package javaBasicPrictice;

public class LoopPractice2 {
	//sum upto 1-100 by decreasing  by order 
 
	public static void main(String[] args) {
		 int sum = 0;
		 int i;
		 for(i =100; i>=1 ; i = i-1) {
			//sum +=i;
			 sum= sum +i;
			
		 }
		 System.out.println(sum);
	}

}
