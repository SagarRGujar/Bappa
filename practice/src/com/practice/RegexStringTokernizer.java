package com.practice;

import java.util.StringTokenizer;

public class RegexStringTokernizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringTokenizer st=new StringTokenizer("18-6-2022","-");
		 
		 while(st.hasMoreTokens())
		 {
			 System.out.println(st.nextToken());
		 }
		 

	}

}
