package chat_gpt_100_projects;

public class leap_or_not {

	public static void main(String[] args) {
		int a = 2028;
		if((a % 4 == 0 && a% 100 != 0) || (a %400 == 0)) {
			System.out.println("it is leap year");
		}else {
			System.out.println("it is not leap year ");
		}

	}

}
