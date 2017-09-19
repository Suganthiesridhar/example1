package monday2;

public class Fulluniv {
		int points;  
		String name;  
		String items;
		int item_cost;
		void insert(int a,String n,String i,int c){  
		points=a;  
		name=n;  
		items=i;  
		item_cost=c;
		}  }
		class Fulluniv1 extends Fulluniv {
		void pointsgained(int challenge_points){  
		points+=challenge_points;  
		System.out.println(challenge_points+" points completed in Full univ");  
		}  
		}

		class Fulluniv2 extends Fulluniv{
		void buyingitems(int challenge_points){  
		if(points<item_cost){  
		System.out.println("you cannot buy the item from the Full university store");  
		}
		else{  
		points=points-challenge_points;  
		System.out.println("your points have been deduced " +points);  }
		}  
		
		
		void checkpoints(){
			System.out.println("your present points : "+points);
			}  
		void display(){
			System.out.println("points:"+points+"\n"+"empname : "+name+"\n"+"itemname:"+items+"\n"+"cost:"+item_cost+"\n");
			}  
		}  
		  
		class Store{  
		public void main(String[] args){  
		Fulluniv a1 = new Fulluniv();  
		Fulluniv2 a2= new Fulluniv2();
		Fulluniv1 a3= new Fulluniv1();
		a1.insert(250,"Suganthie","chocopie",1500);  
		a2.display();  
		a2.checkpoints();  
		a3.pointsgained(30);  
		a2.checkpoints();  
		a2.buyingitems(120);  
		a2.checkpoints();  
		}
		}   


