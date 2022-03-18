package lab6;
import java.util.Scanner;
public class Employee {
	private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the employee’s first name:");
        String firstName=scan.nextLine();
        System.out.println("Please input the employee’s last name:");
        String lastName=scan.nextLine();
        System.out.println("Please input the employee’s age:");
        int age=scan.nextInt();
        System.out.print("Please input the employee’s salary:");
        double salary=scan.nextDouble();
 
      toString();
       

    }

    public String toString() { 
        System.out.print("Employee information: "+firstName + " " + lastName+ "," + " " + age + "," +" " + salary);
		return null;
    }
}