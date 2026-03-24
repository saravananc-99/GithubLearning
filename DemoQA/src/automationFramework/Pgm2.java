package automationFramework;

import java.util.Scanner;

public class Pgm2 {
	
	Pgm2(){
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int rev = 0;
	
	while(num!=0) {
		
		rev = num + sc.nextInt();
	}
	System.out.println(rev);
	
	
	sc.close();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pgm2 pg = new Pgm2();
	}

}
