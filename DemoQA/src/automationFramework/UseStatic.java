package automationFramework;

public class UseStatic {
	static int a = 10;
	
public static void m1 () {
	
	
         UseStatic.a = 12;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UseStatic.m1();
				
		System.out.println(a);
		
		a = 11;
		
		System.out.println(UseStatic.a);
		
		

	}

}
