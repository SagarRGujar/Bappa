package com.regex;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileMo_no {

	public static void main(String[] args) throws IOException {
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		
		PrintWriter out=new PrintWriter(new File("C:/Users/SONY/Documents/output.txt"));
		BufferedReader br=new BufferedReader(new FileReader("C://Users//SONY//Documents//input.txt"));
		
		
		String line=br.readLine(); 
		
		while(line != null)
		{
			Matcher m=p.matcher(line);
			 
			while(m.find())
			{
				out.println(m.group());
			}
			
			line=br.readLine();
		}
		
		out.flush();
		System.out.println("Program run succesfully");
	}

}
