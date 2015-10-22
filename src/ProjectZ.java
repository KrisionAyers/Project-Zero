import java.util.Scanner;
public class ProjectZ {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter your age: ");
		
		double age = input.nextDouble();
		System.out.print("Your age is: " + age);
		
		boolean Peggy = true;
		boolean Steven = false;
		
		if (Peggy){
			System.out.print("Hey Peggy.");
		} else if (Steven){
			System.out.print("Hey Steven");
		} else {
			System.out.print("Who are you?");
		}
	}

}
