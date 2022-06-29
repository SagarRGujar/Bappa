package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexMoblileNumber {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.next();
		Matcher m=p.matcher(str);
		
		if(m.find()&&m.group().equals(str))
		{
			System.out.println("mobile number is valid: "+str);
		}
		else
			System.out.println("mobile number is invalid: "+str);
	}

}
