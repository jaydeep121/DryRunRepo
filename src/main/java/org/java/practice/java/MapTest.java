package org.java.practice.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
	public static void addData() {
		Map<String, String> map=new HashMap<String, String>();
		map.put("jaydeep", "Delhi");
		map.put("anuj", "bihiya");
		map.put("AK", "Katteya");
		Iterator<Map.Entry<String, String>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	public static void getWordCount() {
		String value="jaydeep kumar pal pal kumar kumar kumar";
		String word[]=value.split(" ");
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<word.length;i++) {
			if(map.containsKey(word[i])) {
				map.put(word[i],map.get(word[i])+1);
			}
			else {
				map.put(word[i], 1);
			}
		}
		System.out.println(map);	
	}
	public static void getCharCount() {
		String word="jaydeep kumar pal";
		char ch[]=word.replaceAll("\\s", "").toCharArray(); //To remove space
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
	public static void main(String arg[]) {
		getCharCount();
	}
}
