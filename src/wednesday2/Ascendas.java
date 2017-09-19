package wednesday2;

abstract public class Ascendas {
	  
		   void Pinacle(){
			   System.out.println("You can go by many ways to reach the required building");}  
		   abstract void mainentrance();  
		   void Zenith(){
			   System.out.println("Go straight and go left you will reach the zenith building");}  
		 }  
		  
		 class Ascendas1 extends Ascendas{  
		 void Zenith(){
			 System.out.println("Take right from the main entrance to reach pinacle buliding");}

	void mainentrance() {
			System.out.println("Go Straight and take left to reach the crest bulding");			
		}  
		 }  
		 class Ascendas2{  
		 public static void main(String args[]){  
		  Ascendas building = new Ascendas1();  
		  building.Zenith();  
		  building.Pinacle();  
		  building.mainentrance();
		 }  
		}  

