package monday2;

public class Phase {
	  
		int itemcost(){
			return 0;
			}  
		int itemcose1(){
			return 50;
			}  
		int itemcost2(){
			return 15;
			}
		
		String itemcost(String a){
			return a;
		}
		  
		int itemcost3(){
			return 10;
			}  
}
		 class Buy{  
		public static void main(String args[]){  
		Phase b;  
		b=new Phase();  
		System.out.println("The walnuts you  purchased costs: "+b.itemcost());  
		b=new Phase();  
		System.out.println("The chocpie you purchased costs: "+b.itemcost());  
		b=new Phase();  
		System.out.println("The waterbottle you purchased costs: "+b.itemcost());  
		}
		}
		 

 