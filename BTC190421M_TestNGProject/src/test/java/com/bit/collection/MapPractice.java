package com.bit.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MapPractice {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// Map specific method
//	Map<Integer, String> m = new HashMap<Integer, String>();
//	
//	@Test
//	public void test() {
//		m.put(1, "i");
//		m.put(2, "am");
//		m.put(3, "here");
//		m.put(4, "now");
//		
//		Iterator<Integer> k = m.keySet().iterator();
//		while (k.hasNext()) {
//			
//			System.out.println("key is "+k.next());
//			
//		}
//		
//		Iterator<String> kv = m.values().iterator();
//		while (kv.hasNext()) {
//			
//			System.out.println("value is "+kv.next());
//			
//		}
//		
//		
//		Iterator<Entry<Integer,String>> kv1 = m.entrySet().iterator();
//		
//		while (kv1.hasNext()) {
//			Entry<Integer, String> kv11 = kv1.next();
//			System.out.println("key is "+kv11.getKey());
//			System.out.println("value is "+kv11.getValue());
//		}
//		
//		
//		
//	}
//	

	// Map specific method
	Map<Integer, String> m = new Hashtable();// syncronized and legacy class performace wise slow
	Map<Integer, String> m1 = new HashMap();// not syncronized and not legacy class performace wise faster

	@Test
	public Map<String, String> exceute() {
		Map<String, String> mp = new HashMap();
		WebDriver dr = new ChromeDriver();
		dr.get("file:///Users/bittech/Desktop/htmlPractice.html");
		int s = dr.findElements(By.xpath("//tr")).size();
		for (int i = 2; i <= s; i++) {
			// int sn=dr.findElements(By.xpath("//tr["+i+"]/td")).size();

			// String k=dr.findElement(By.xpath("//tr["+i+"]/td[1]")).getText();
			// String v=dr.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
			int j = 1;
			String k = dr.findElement(By.xpath("//tr[" + i + "]/td[" + j + "]")).getText();

			String v = dr.findElement(By.xpath("//tr[" + i + "]/td[" + j + 1 + "]")).getText();

			mp.put(k, v);

		}
		Iterator<Entry<String, String>> it = mp.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, String> e = it.next();
			System.out.println("Key is " + e.getKey() + " count is " + e.getValue());
		}

		return mp;
	}

	public HashMap<Character, Integer> countCharacter(char[] c) {

		HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
		for (char x : c) {
			if (hp.containsKey(x)) {
				hp.put(x, hp.get(x) + 1);
			} else
				hp.put(x, 1);
		}
		return hp;
	}

	@Test
	public void test1() {
//			Object o1=m.put(1, "shahid");
//			System.out.println(o1);
//			Object o=m.put(1, "asad");
//			m.put(1, "asad");
//			m.put(13, "fgh");
//			m.put(16, "dbfgb");
//			System.out.println(m.get(1));
//			//m.put(null, "asfd");//no null key
//			//m.put(4, null);//no null value
//			
//			m1.put(null, "asfd");//only one null key
//			m1.put(4, null);//multiple null value
//			
//			//to get key one by one
//			Iterator<Integer> i=m.keySet().iterator();
//			while(i.hasNext())
//			{
//				System.out.println(" key is "+i.next());
//			}
//			
//			//to get value one by one
//			Iterator<String> i1=m.values().iterator();
//			while(i1.hasNext())
//			{
//				System.out.println("value is "+i1.next());
//			}
//			
//			Iterator<Entry<Integer, String>> i2=m.entrySet().iterator();
//			while(i2.hasNext())
//			{
//				//System.out.println(i2.next());
//				Entry<Integer, String> e=i2.next();
//				System.out.println(e.getKey());
//				System.out.println(e.getValue());
//			}

		String s = "united state of america";
		char[] c = s.toCharArray();

		HashMap<Character, Integer> v = countCharacter(c);
		Iterator<Entry<Character, Integer>> it = v.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> e = it.next();
			System.out.println("Key is " + e.getKey() + " count is " + e.getValue());
		}
//			

		m1.putAll(m);
//			m.containsKey(2);
//			m.containsValue("shahid");
//			m.clear();
//			m.get(1);
//			m.equals(m1);
//			m.hashCode();
//			m.size();
//			Collection c=m.values();
//			Set s=m.keySet();
//			Set<Entry<Integer, String>> kv=m.entrySet();
//			m.remove(1);

	}

}
