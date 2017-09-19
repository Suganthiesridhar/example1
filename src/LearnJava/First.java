package LearnJava;

public class First{  
	  public void msg(){
		  System.out.println("Hello");}  
	}  
	//save by Second.java  
	package LearnJava;  
	import Learnjava.*;    
	class Second{  
	  public static void main(String args[]){  
	   First obj = new First();  
	   obj.msg();  
	  }  
	}  
