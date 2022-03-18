
import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scan = new Scanner(System.in);
        
         System.out.print("Input the first number:");   
         int i=scan.nextInt();
         System.out.print("Input the operator:");
         String j=scan.nextLine();
         System.out.print("Input the second number");
         int a=scan.nextInt();
        
         switch (j) {
         case "+":
           add(i, a);
           break;
        case "-":
          subtract(i, a);
          break;
         case "*":
            multiply(i, a);
           break;
         case "/":
          divide(i,a);
           break;
           default:}
        	   
         }
         
         
     

    public String add(int a, int b) {
         
      return a+" + "+b+" = " +(a+b);
         
        
    }

    public String subtract(int a, int b) {
    	return a+" - "+b+" = "+(a-b); 
        
    }

    public String multiply(int a, int b) {
    	return a+" * "+b+" = "+(a*b);
        
    }

    public String divide(int a, int b) {
    	return a+" / "+b+" ="+a/b;
      
    }
}
