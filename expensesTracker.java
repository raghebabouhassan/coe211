package lab6;
import java.io.File;
import java.io.FileWriter;  
import java.io.IOException; 
import java.util.Scanner;
public class expensesTracker {

	public static void main(String[] args) throws IOException{

		FileWriter fw = new FileWriter(new File("expenses.txt"),true);

		String a,g;
			Scanner scan= new Scanner (System.in);
			do {
			System.out.println("Input your name: ");
			String b= scan.nextLine();
			System.out.println("What did you purchase?" );
			String c=scan.nextLine();
			System.out.println("How much did you pay?");
			double f=scan.nextDouble();
			scan.nextLine();
			fw.write(b+c+f);
			
			
			
		System.out.println("Would you like to log another purchase? (y/n)");
			
			a= scan.nextLine();
			System.out.println(a);
			}while (a.equals("y"));
			
			
				System.out.println("Get off of ZoodMall!");
			
			
			fw.close();
			
			
		}

		}



