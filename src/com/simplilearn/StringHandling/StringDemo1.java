package com.simplilearn.StringHandling;

public class StringDemo1 {

	public static void main(String[] args) {
	
		String s1="Goutam_";
		s1.concat("_S_Dodamani");
		System.out.println(s1);
		StringBuffer s2=new StringBuffer("Goutam");
		s2.append("_S_Dodamani");
		System.out.println(s2);
		
		System.out.println(s2);
		int x=s2.indexOf("Dod");
		System.out.println(x);
		StringBuilder s3=new StringBuilder("goutam");
		System.out.println(s3);
		
		
		

	}

}
