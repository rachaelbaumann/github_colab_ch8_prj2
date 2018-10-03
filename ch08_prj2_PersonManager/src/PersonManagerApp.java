
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the 'Person Manager' application!");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String type = Console.getString("Create customer or emplyee? (c/e)  ", "c", "e");
			System.out.println();
		
			String first = Console.getString("First name:  ");
			String last = Console.getString("Last name:  ");
			
			Person person;
			if (type.equalsIgnoreCase("c")) {
				String customerNo = Console.getString("Customer number:  ");
				person = Customer(first, last, customerNo);
			} else if (type.equalsIgnoreCase("e")) {
				String ssn = Console.getString("SSN:  ");
				person = Employee(first, last, ssn);
			}
			
			 Class c = person.getClass();
			 
			 System.out.println("\nYou entered a new " + c.getName() + ":");
			 System.out.println(person.toString());
			 System.out.println();
			
			choice = Console.getString("Would you like to add another person to manage? ", "y", "n:");
		}
		
		System.out.println("Thank you for using the 'Person Manager' application!");
	}

}
