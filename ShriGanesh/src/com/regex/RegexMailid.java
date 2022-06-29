package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMailid {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		Matcher m=p.matcher(str);
		
		if(m.find()&&m.group().equals(str))
			System.out.println("valid mail id: "+ str);
		else
			System.out.println("invalid mail id: "+ str);
	}
}
