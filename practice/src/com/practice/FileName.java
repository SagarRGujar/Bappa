package com.practice;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//find pdf files in the folder.
public class FileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p=Pattern.compile("(.)+[.]pdf");
		File f=new File("C:\\Users\\SONY\\Downloads");
		String[] list=f.list();
		
		for(String l1:list)
		{
			Matcher m=p.matcher(l1);
			
			if(m.find()&&m.group().equals(l1))
			{
				System.out.println(l1);
			}
		}
		

	}

}
