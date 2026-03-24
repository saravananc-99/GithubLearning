package automationFramework;

import java.util.ArrayList;
import java.util.Scanner;


//Sorting asc/ desc order

public class Pgm {

	int temp;

	void asc() throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			al.add(sc.nextInt());
		}
		for (int j = 0; j < al.size(); j++)

		{

			for (int k = j + 1; k < al.size(); k++) {
                
				
				//if (al.get(j) < al.get(k)
				if (al.get(j) > al.get(k)) {

					temp = al.get(j);
					al.set(j, al.get(k));
					al.set(k, temp);

				}
			}

			System.out.println(al.get(j));
		}
		sc.close();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Pgm pg = new Pgm();
		pg.asc();
	}

}
