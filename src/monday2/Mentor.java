package monday2;

public class Mentor {
		int empcode;  
		String empname;  
		int salary;  
		String mentorname;
		Mentor(int empcode,String empname,int salary,String mentorname){  
		this.empcode=empcode;  
		this.empname=empname;  
		this.mentorname=mentorname;  
		}  
		Mentor(int empcode,String empname,String mentorname,int salary){  
		this.salary=salary;  
		}  
		void display(){
			System.out.println(empcode+" "+empname+" "+salary+" "+mentorname);
			}  
		}  
		class Septembersquad{  
		public static void main(String args[]){  
		Mentor m1=new Mentor(105964,"Suganthie",7000,"Benson");  
		Mentor m2=new Mentor(105970,"Swetha",7000,"Benson"); 
		Mentor m3=new Mentor(105968,"Vasavi",7000,"Benson"); 
		Mentor m4=new Mentor(105962,"Silambarasan",7000,"Benson"); 
		m1.display();  
		m2.display();  
		m3.display();
		m4.display();
		}
		}  




