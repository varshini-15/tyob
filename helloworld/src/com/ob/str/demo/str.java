

package com.ob.str.demo;

public class str {
	public static void main(String[] args) {
		String s1 = "Abcy";
		String s2 = "Abczefgh";
		String s3 = s1.concat(s2);
		s1.concat(s2);
		s1.append("qwe");
		System.out.println(s1.charAt(2));
		System.out.println(s1.codePointAt(2));
		System.out.println(s1.codePointBefore(2));
	//	System.out.println(s1.codePointCount(4, 5));
		System.out.println(s1.compareTo("abcdefgh"));
		System.out.println(s2.compareToIgnoreCase(s1));
		System.out.println(s1.contains(s2));
		System.out.println(s1.contentEquals("as"));
	}
}
