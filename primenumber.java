package chat_gpt_100_projects;
import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter a number");
	    Integer number = s.nextInt();
	    System.out.println("the number is "+number);
	       if(number% 2==0 || number/number ==1) {
	    	System.out.println("the number is not prime"+number);
	      }else {
	    	  System.out.println("it is prime"+number);
	      }
	  
	}

}
