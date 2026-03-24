package automationFramework;

import java.util.Scanner;

public class evenorodd {
	
	
	evenorodd (int num) {
		
		
		if(num%2==0) {
			
		System.out.print("The number is Even" +  "        "    +    num);
		
		}
		else
			
		{
			System.out.print("The number is Odd" +  "         "    +  num);
		}
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int nm = sc.nextInt();
		
		
		evenorodd sm = new evenorodd(nm);
	
		
	

	}

}
