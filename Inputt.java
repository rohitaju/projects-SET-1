package chat_gpt_100_projects;

import java.util.Scanner; // Import should be OUTSIDE any class

public class Inputt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Student: " + isStudent);
    }
}