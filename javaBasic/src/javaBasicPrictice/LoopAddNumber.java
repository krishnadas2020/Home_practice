package javaBasicPrictice;

public class LoopAddNumber {

	public static void main(String[] args) {
		// sum upto 100 using for loop
		 int sum=0;
		 int i;
		 for(i =1; i<=100; i=i+1) {
			/* if(i % 2 ==1) {
				 sum=sum+i;
			
			}*/
			 
			 sum +=i;
			 
			 System.out.println(sum); 
		 }
      //System.out.println(sum);
	}

}
