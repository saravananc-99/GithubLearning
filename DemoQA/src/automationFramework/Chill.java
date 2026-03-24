package automationFramework;


  abstract  class  Summer {
	 
	 String Season;
	
	Summer(String Season) { 
		
	
	System.out.println(this.Season= Season);
			
	}
	
	abstract void Juice();
	

}


class Fruits extends Summer{
	
	 
	Fruits(String Season) {
		super(Season);
		// TODO Auto-generated constructor stub
	}

	void Juice()
	 {
		System.out.println("Fruit Juice");
	}


}

public class Chill
{
public static void main(String[] args) {
	
	Fruits f1 = new Fruits("Summer");
	f1.Juice();
	
	
}
	
}
