
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the 'Person Manager' application!");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			choice = Console.getString("Would you like to add another person to manage? ", "y", "n:");
		}
		
		System.out.println("Thank you for using the 'Person Manager' application!");
	}

}
