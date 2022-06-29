package com.regex;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class No_of_file {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("[a-zA-Z0-9_$.]+[.]txt");
		
		File f=new File("C:\\Users\\SONY\\Documents");
		String[] list=f.list();
		
		for(String s1:list)
		{
			Matcher m=p.matcher(s1);
			if(m.find()&&m.group().equals(s1))
			{
				System.out.println(s1);
			}
		}
	}

}
