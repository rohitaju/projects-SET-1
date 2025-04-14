package chat_gpt_100_projects;

public class GCD {

	public static void main(String[] args) {
		int a = 85;
		int b = 95;
		int c = findGCD(a,b);
		
		System.out.println("the gcd is"+c);
		int lcm1 = (a*b);
	    int lcm = lcm1/c;
	    System.out.println("the lcm is"+lcm);
	
	
	}
	static int findGCD(int a, int b) {	
		while(b!=0) {
			int d = b;
			b=a%b;
			a = d;
		}

	    return a;
	  }
	// int lcm1 = (a*b);
	 //  int lcm = lcm1/c;
	 // a%b== b
	//c=a
	    
}
