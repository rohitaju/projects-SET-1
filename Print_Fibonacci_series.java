package chat_gpt_100_projects;

public class Print_Fibonacci_series {

	public static void main(String[] args) {
		int num =8;
		int first = 0, secound = 1;
		System.out.println(num);
		for(int i = 1; i<=num ; i++) {
			System.out.print(first + " ");
			int next = first + secound;
			first = secound;
			secound = next;
		}
        
	}

}
