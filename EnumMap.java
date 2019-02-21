package Enumeration;

import java.util.*;
/*
 * 创建一个泛型的类了，在这个类中实例话一个集合类Map的对象，作为成员变量；
 * 并通过Map的对象定义一个成员方法put()和get();
 */
public class EnumMap<K,V> {
	
	public Map<K,V> mpO = new HashMap<K,V>();
	public void put(K k,V v){
		mpO.put(k,v);
	}
	public V get(K k){
		V vO = mpO.get(k);
		return vO;
	}
	
	public static void main(String [] args){
		EnumMap<Integer,String> mpT = new EnumMap<Integer,String>();
		for(int i=0;i<=10;i++){
			mpT.put(i, "I am the"+"\t"+i+"here.");
		}
		for(int i=0;i<mpT.mpO.size();i++){  //成员变量mpO的大小，类的实例对象调用成员变量，在使用成员调用方法来得到集合的大小；
			String str = mpT.get(i);
			System.out.println(str);
		}
	}
	
}
