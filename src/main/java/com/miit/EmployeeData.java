package com.miit;

public class EmployeeData {
         int age;
    	 String name;
    	 
    	public EmployeeData(int age,String name){
    		 this.age=age;
    		 this.name=name;
    	 }
    	
    	 public static void main(String args[]) {
    		 
 
    	 EmployeeData obj1=new EmployeeData(30,"john");
    	 EmployeeData obj2=new EmployeeData(20,"josh");
    	 System.out.println(obj1.age+obj1.name);
    	 System.out.println(obj2.age+obj2.name);
    	 
     }
}
