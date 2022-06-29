package com.regex;

public class StringSplit {
		//String class split() method can take pattern as an argument.
	public static void main(String[] args) {
		String Str="om sai ram";
		
		String[] s1=Str.split("\\s");
		
		for(String s2:s1)
		{
			System.out.println(s2);
		}
	}

}
