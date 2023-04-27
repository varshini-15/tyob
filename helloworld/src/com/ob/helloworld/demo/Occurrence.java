package com.ob.helloworld.demo;

public class Occurrence {
	public static void main(String[] args) {
		String s = "praaavvveeeen";
		char[] ch = s.toCharArray();
		int count[] = new int[s.length()];
		for (int i = 0; i < count.length; i++) {
			count[i] = 1;
		}
		for (int i = 0; i < s.length(); i++) {
			
				for (int j = i + 1; j < s.length(); j++) {
					if (ch[i] == ch[j]) {
						count[i]++;
					}

				}
			
		}
		for (int i = 0; i < ch.length; i++) {
			
				System.out.println(ch[i] + " " + count[i]);

			
			
		}

	}
}
