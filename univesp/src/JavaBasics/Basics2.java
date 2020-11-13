package JavaBasics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Basics2 {
	public static void main(String[] args){
		DoStuff();
	}
	
	public static String IamDog() {
		return "I am dog";
	}
	
	public static void DoStuff() {
		ArrayList<String> a= new ArrayList<String>();
		List <Integer> l2 = new LinkedList<Integer>();
		List <Integer> l3 = new ArrayList<Integer>();
		a.add("Oi");
		a.add("tudo bom?");
		a.remove(0);
		System.out.println(a);
		for (int i=0; i<5; i++) {
			l2.add(i,i);
			l3.add(i,i);
		}
		for (int j =0; j<l2.size();j++) {
			System.out.println(l2.get(j));
			System.out.println(l3.get(j));
		}
		//This way is better for linked list, get is to expensive
		for(Integer obj:l2) {
			System.out.println(obj);
		}
		System.out.println(l2.contains(5));
	}
}
