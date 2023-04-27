package com.ob.hashmaps.demo;

import java.util.*;

public class Hashhmap {
	public static void main(String[] args) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		map.put(1, true);
		map.put(4, true);
		map.put(3, false);
		
		map.put(null, true);
		map.put(6, null);
		map.replace(6, true);
		map.replace(null, false);
		
		System.out.println(map);
		System.out.println(map.get(4));
		System.out.println(map.get(false));
		for (Map.Entry a : map.entrySet()) {
			if (a.getKey().equals(true)) {
				System.out.println(a.getValue());

			}
		}
		System.out.println(map);
	}
}
