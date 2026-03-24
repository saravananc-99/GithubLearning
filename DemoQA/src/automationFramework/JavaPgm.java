package automationFramework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaPgm {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		    FileReader fr = new FileReader("FileReader.txt");
			BufferedReader br = new BufferedReader(fr);
			String C= br.readLine();
			while(C!=null)
			{
			System.out.println(C);
			
			boolean Username = C.contains("Username:");
			String Strvalue = C.substring(9);
			C=br.readLine();
			if  ( Username){
				
				System.out.println("Username:-" + Strvalue);
				
			}
			else {
				
				//String Strvalue = C.substring(9);
				System.out.println("Password:-" + Strvalue);
				
				
			}
						}
										
			br.close();
		}
		
		catch (Exception e) {
			
		}
		
	}


}
