package com.java.codingbat;

import java.util.HashMap;
import java.util.Map;

public class MapBasic {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("ice-cream", "cherry");	
		map.put("salad", "oil");
		map.put("potato", "ketchup");	
		map.put("a", "aaa");
		map.put("b", "bbb");
		System.out.println(mapAB4(map));
	}
	public static Map<String, String> mapAB4(Map<String, String> map) {
		int aLen=map.get("a").length();
		int bLen=map.get("b").length();
		if(aLen>bLen) {
			map.put("c", map.get("a"));
		}
		else {
			map.put("c", map.get("b"));
		}
		  return map;
	}

	public static  Map<String, String> mapAB3(Map<String, String> map) {
		if(map.containsKey("a") && !map.containsKey("b")) {
			map.put("b", map.get("a"));
		}
		if(map.containsKey("b") && !map.containsKey("a")) {
			map.put("a", map.get("b"));
		}
		  return map;
	}

	public static Map<String, String> mapAB2(Map<String, String> map) {
		String a = map.get("a");
		String b = map.get("b");
		if((a!=null && b!=null) && a.equals(b)) {
			map.remove("a");
			map.remove("b"); 
		}
		return map;
	}

	public static Map<String, String> topping3(Map<String, String> map) {
		if(map.get("potato")!=null) {
			map.put("fries", map.get("potato"));
		}
		if(map.get("salad")!=null) {
			map.put("spinach", map.get("salad"));
		}
		  return map;
	}
	public static Map<String, String> topping2(Map<String, String> map) {
		if(map.containsKey("ice-cream")) {
			map.put("yogurt", map.get("ice-cream"));
		}
		if(map.containsKey("spinach")) {
			map.put("spinach", "nuts");
		}
		return map;
	}

	public static Map<String, String> topping1(Map<String, String> map) {
		if(map.containsKey("ice-cream")) {
			map.put("ice-cream", "cherry");
		}
		map.put("bread", "butter");
		return map;
	}
	public static Map<String, String> mapAB(Map<String, String> map) {
		  if(map.containsKey("a") && map.containsKey("b")) {
			  map.put("ab", map.get("a")+map.get("b"));
		  }
		  return map;
	}

	public static Map<String, String> mapShare(Map<String, String> map) {
		if(map.containsKey("a")) {
			map.put("b",map.get("a"));
		}
		map.remove("c");
		return map;
	}
	public static Map<String, String> mapBully(Map<String, String> map) {
		if(map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}
}
