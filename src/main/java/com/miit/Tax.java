package com.miit;

public class Tax {
public static void main(String a[])  {
	int salary;
	double Tax;
	System.out.println("Enter Salary");
	
	if(salary<=15000)
	{
		System.out.println(salary+"No Tax");
	}
	else if(salary>15000 && salary<=100000)
	{
		Tax=salary*0.10;
		System.out.println(salary+"."+Tax);
	}
	else
	{
		Tax=salary*0.20;
		System.out.println(salary+"No Tax");	
	}
}
	
}
