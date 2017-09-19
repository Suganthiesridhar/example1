package wednesday2;

public class Employee {

	    private int sno;
	    private String internName;
	    private int empAge;

	    //Getter and Setter methods
	    public int getempsno(){
	        return sno;
	    }

	    public String getInternName(){
	        return internName;
	    }

	    public int getEmpAge(){
	        return empAge;
	    }

	    public void setEmpAge(int e){
	        empAge = e;
	    }

	    public void setEmpName(String n){
	        internName = n;
	    }

	    public void setEmpSSN(int s){
	        sno = s;
	    }
	}
	 class EncapsTest{
	    public static void main(String args[]){
	         Employee emp = new Employee();
	         emp.setEmpName("suganthie");
	         
	         
	         emp.setEmpAge(22);



	         emp.setEmpSSN(105964);



	         System.out.println("Employee Name: " + emp.getInternName());
	         System.out.println("Employee SSN: " + emp.getempsno());
	         System.out.println("Employee Age: " + emp.getEmpAge());
	    } 
	}
		

	


