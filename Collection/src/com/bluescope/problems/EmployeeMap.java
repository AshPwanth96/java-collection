package com.bluescope.problems;

import java.util.HashMap;
import java.util.Map;

class Employee{
	
	String name;
	String gender;
	int salary;
	
	Employee(String name, String gender, int salary){
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
}

public class EmployeeMap{
	public static void main(String args[]) {
		Employee ash = new Employee("Ash", "Male", 25000);
		Employee bala = new Employee("bala", "Male", 37500);
		Employee ana = new Employee("Ana", "Female", 40000);
		Employee bhaviya = new Employee("Bhaviya", "Female", 24000);
		Employee vijay = new Employee("vijay", "Male", 36000);
		
		Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
		emp.put(1, ash);
		emp.put(2, bala);
		emp.put(3, ana);
		emp.put(4, bhaviya);
		emp.put(5, vijay);
		
		emp.values()
		.stream()
		.sorted((e1, e2)->Integer.compare(e1.salary, e2.salary))
		.forEach(e->System.out.println("name :"+e.name+
				" gender is "+e.gender+
				" salary "+e.salary));
		}
	}

