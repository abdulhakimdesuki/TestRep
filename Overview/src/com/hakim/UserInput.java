package com.hakim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// BufferReader
// scanner
public class UserInput {

	public static void main(String[] args) throws Exception  {
		int n;
		System.out.println("Enter a number : ");
		
		Scanner sc=new Scanner(System.in);
		n =sc.nextInt();
		System.out.println(n);

//		try (BufferedReader br= new BufferedReader(new InputStreamReader(System.in)))
//		{
//			n = Integer.parseInt(br.readLine()); // 45
//	        System.out.println(n);
//
//		} 

//		BufferedReader br=null;
//		try 
//		{
//			br= new BufferedReader(new InputStreamReader(System.in));
//			n = Integer.parseInt(br.readLine()); // 45
//	        System.out.println(n);
//		} 
//
//		finally {
//			br.close();
//		}





	}

}
