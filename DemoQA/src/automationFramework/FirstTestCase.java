package automationFramework;

public class FirstTestCase {
	

		

	public static void main(String[] args) {
		String name = "Moshi";
		String reverse ="";
		System.out.println("Reverse a string"  + name);
		
		for (int i=name.length()-1;i>=0;i--)
		{
			
			System.out.print(name.charAt(i));
			}
	}

}