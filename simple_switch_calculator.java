package chat_gpt_100_projects;

public class simple_switch_calculator {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 4;
		
		int cal = 1;

		switch (cal) {
		    case 1:
		        System.out.println("a+b="+(a+b));
		        break;
		    case 2:
		        System.out.println("a-b="+(a+b));
		        break;
		    case 3:
		        System.out.println("a/b="+(a/b));
		        break;
		    default:
		        System.out.println("Invalid symbol");
		}
	}

}
