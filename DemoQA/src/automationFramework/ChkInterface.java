package automationFramework;


interface Songs{
	
	void music();
	String love = "Mass king Yuvan";
	
}


class movie implements Songs{
	
	
	@Override
	 public void music (){
		 
				 
		 System.out.println("God of music Ilayaraja");
		 
	 }
	
}

class bgm implements Songs{

	@Override
	public void music() {
		// TODO Auto-generated method stub
		 System.out.println("Bgm King Anirudh");
	}
	
	
	
}
public class ChkInterface {

	public static void main (String args []) {
		
		bgm bg = new bgm();
		bg.music();
		System.out.println(bg.love);
		
		movie mo = new movie();
		mo.music();
		
		String love = Songs.love;
		System.out.println(bg.love);
		
		
		
	}
}
