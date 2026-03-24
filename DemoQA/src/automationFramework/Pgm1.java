package automationFramework;

import java.util.Scanner;

//Reverse a String
public class Pgm1 {
	
	public void revstring(){
	
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	String rev="";
	
	  for(int i=name.length()-1;i>=0;i--) {
		 
		  rev  = rev +  name.charAt(i);                                    
		 
	 }
		System.out.print(rev);
	
	  sc.close();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pgm1 pg = new Pgm1();
		pg.revstring();

	}

}
