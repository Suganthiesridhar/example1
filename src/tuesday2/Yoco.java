package tuesday2;

abstract class Yoco {
	
		abstract void clockin();  {
		
		}
		}  
		 
	   class Clockin extends Yoco{  
		void clockin1(){
			System.out.println("you have successfully clocked in");}

		@Override
		void clockin() {
			System.out.println("you have clocked in @10am");}

		}  
		
		 class Clockout extends Yoco{  
		void clockout1(){
			System.out.println("You have clocked out successfuly");}

	
		void clockin() {
			System.out.println("You have clocked out @7pm");}

			}  
		  
		 
		class Abstact{  
		public static void main(String args[]){  
		Yoco s= new Clockout();
		s.clockin();
		((Clockout) s).clockout1();
		} } 
		  

