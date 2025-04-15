package chat_gpt_100_projects;

public class pick_odd_numbers {

	public static void main(String[] args) {
		for(int i = 1 ; i<=101 ;i++) {
			if(i%2==0) {
				System.out.println("not odd");
				continue;
			}else {
				System.out.println("odd"+i);
			}
		}

	}

}
