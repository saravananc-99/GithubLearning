package automationFramework;

import java.util.Scanner;

public class School {
	
	
	String passorFail(int TotalMarks) {
		
		String result;
		
		if(TotalMarks>50) {
			
		
	       result = "Pass";
		}
		
		else
		{
			result = "Fail";
		}
		
		return result;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		Scanner sc = new Scanner(System.in);
		int Tmarks= sc.nextInt();
		
		School school = new School();
		String ExamResult = school.passorFail(Tmarks);
		System.out.println(ExamResult);	

	}

}
