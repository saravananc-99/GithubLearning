package Collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add("sara");
		ar.add(2);
		ar.add("moshi");
		ar.add(3);
		ar.add("Gayu");
		System.out.println(ar);
		
		//Object a = ar.get(5);
		//System.out.println(a);

		ArrayList arall = new ArrayList();
		arall.addAll(ar);
		System.out.println(arall);
		arall.remove(5);
		arall.remove(4);
		System.out.println(arall);

	
		ArrayList ret = new ArrayList();
		ret.addAll(ar);
		ret.addAll(arall);
		System.out.println(ret);
		
		ret.retainAll(arall);
		System.out.println(ret);
		
		ret.add("");
		System.out.println(ret);
		
}
		
		

	}


