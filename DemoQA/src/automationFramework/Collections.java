package automationFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Collections {
	
	public static void main(String args[]) {
		 
		ArrayList<String> al = new ArrayList<>();
		al.add("Moshi");
		al.add("Gayu");
		al.add("Sara");
		
		
		al.set(0,"Sara");
		//System.out.println(al);
		
		al.set(2,"Moshika");
		//System.out.println(al);
		
		al.add("Sara");
		al.add("");
		//System.out.println(al);
		
		System.out.println("Duplicatelist:"  + al);
		
		Set<String> hs = new HashSet<>(al);
		
		
		ArrayList<String> wd = new ArrayList<>(hs);
		
		System.out.println("Nonduplicatelist:"  + hs);
		
		
		
		

	
			
					
		
		

		
	}
}
