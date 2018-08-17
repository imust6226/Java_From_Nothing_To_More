package Enumeration;

import java.util.*;
public class showMap {
	
	
	public static void main(String [] args){
		/*
		 * 集合List
		 * ArrayList
		 * LinkedList
		 */
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		for (int i=0;i<a.size();i++){
			int aO = a.get(i);
			System.out.println(aO);
		}
		/*
		 * 集合Map
		 * HashMap
		 * TreeMap
		 * 下表从0开始
		 */
		Map<Integer,String> mpO = new HashMap<Integer,String>();
		mpO.put(1,"Tiger");
		mpO.put(2,"Cheapter");
		mpO.put(3, "Cat");
		for(int i=0;i<mpO.size();i++){
			System.out.println("the"+i+"\t"+mpO.get(i));
		}
		/*
		 * 集合Set
		 * TreeSet
		 * HashSet
		 * */
		//Vector
		Vector<String> vtO = new Vector<String>();
		for(int i=0;i<=10;i++){
			vtO.add("VECTOR"+"\t"+i);
		}
		
		for(int i=0;i<vtO.size();i++){
			System.out.println(vtO.get(i));
		}
	}
}
