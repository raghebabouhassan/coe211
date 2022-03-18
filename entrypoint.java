package lab6;

public class entrypoint {


		// TODO Auto-generated method stub
     private String getFirstname()
     {
    		  return "Rand";
     }
     private String getlastname()
     {
    	      return "Rand"; 
	}
     public int getAge()
     {
    	      return 20;
     }
     public double getSalary()
     {
              return 124.65;
     }
      public String staffMangment() {
      return "Firstname"+getFirstname()+
    		  "\n lastname"+getlastname()+
    		   " age"+getAge();
      }
    		   public class Employeejava
    		   {
    			   public void main(String[] args) 
    			   {
    				   entrypoint stu= new entrypoint();
    				   System.out.print("Firstname :"+stu.getFirstname());
    				   System.out.print("lastname :"+stu.getFirstname());
    				   System.out.print("Age :"+stu.getAge());
    				   System.out.print("Salary"+stu.getSalary());
    				   
    			   
      }
    		   }
}
