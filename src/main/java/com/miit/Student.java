package com.miit;

public class Student {
	  int id;
	  String name;
	  String course;
	  int age;
	  
	  public Student(int id,String name,String course,int age) {
	  this.id=id;
	  this.name=name;
	  this.course=course;
	  this.age=age;
	  }
	  
	  public static void main(String a[])  {
		  
	  Student obj1=new Student(1,"Bobby","B.A",25);
	  Student obj2=new Student(2,"Sue","QA",28);
	  Student obj3=new Student(3,"Lea","DA",30);
	  Student obj4=new Student(4,"Donna","Java",32);
	  System.out.println(obj1.id+obj1.name +obj1.course+obj1.age);
	  System.out.println(obj2.id+obj2.name+obj2.course+obj2.age);
	  System.out.println(obj3.id+obj3.name+obj3.course+obj3.age);
	  System.out.println(obj4.id+obj4.name+obj4.course+obj4.age);
	  
	  
	 
	  		
	}

}
