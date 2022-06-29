package com.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class RegexPatternSplit {
	//pattern class split() can take target string as an argument.
	public static void main(String[] args) {
	 
		Pattern p=Pattern.compile("\\.");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.nextLine();
		
		String[] m=p.split(str);
		
		for(String m1:m)
		{
			System.out.println(m1);
		}

	}

}
