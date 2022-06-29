package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Customer {
	
	public static void func(int a,List<Integer> b)
	{
		a += 1;
		b.add(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		List<Integer> b=new ArrayList<>();
		func(a,b);
		System.out.println(a+b.toString());
	}

}
