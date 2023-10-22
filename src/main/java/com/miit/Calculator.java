package com.miit;

public class Calculator {
	public static void main(String[] args) {
	
		System.out.println(add(2,4));
		System.out.println(substract(4,2));
		System.out.println(multiply(2,4));
		System.out.println(division(4,2));
	}
 public static int add (int a,int b) {
	 return a+b;
 }
	
 public static int substract (int a,int b) {
	 return a-b;
 }
 
 public static int multiply (int a,int b) {
	 return a*b;
 }
 
 public static int division (int a,int b) {
	 return a/b;
 }
 }