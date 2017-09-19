package tuesday2;

public class Intern {
		void firstmonthintern(){
			System.out.println("learning java basics....building programs ");}  
		}  
		class Intern2 extends Intern {  
		void secondmonthintern(){
			System.out.println("completing basic projects assigned to them");}  
		}  
		class Intern3 extends Intern2{  
		void thirdmonthintern(){
			System.out.println("Building websites and products for the company");}  
		}  
		class Fullintern{  
		public static void main(String args[]){  
		Intern3 i=new Intern3();  
		i.thirdmonthintern();  
		i.firstmonthintern();  
		i.secondmonthintern();  
		}}  

