package com.jbs;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*	In case of any non-comparable class, if we provide comparator for it 
 * 	Then the class become comparable as well. 
 */

class Employee implements Comparable<Employee> {
	private int regno;
	private String ename;
	private double basic;
	public Employee(int regno, String ename, double basic) {
		super();
		this.regno = regno;
		this.ename = ename;
		this.basic = basic;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "\nEmployee [regno=" + regno + ", ename=" + ename + ", basic=" + basic + "]";
	}
	@Override
	public int compareTo(Employee o) {
		Integer regno1 = this.regno;
		Integer regno2 = o.regno;
		return regno1.compareTo(regno2);
	}
}

class CustomEnameAscComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		String ename1 = o1.getEname();
		String ename2 = o2.getEname();
		return ename1.compareTo(ename2);
	}
}

class CustomBasicDescComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		Double basic1 = o1.getBasic();
		Double basic2 = o2.getBasic();
		return -basic1.compareTo(basic2);
	}
}

public class TestTreeSet_v4 {
	public static void main(String[] args) {
		// In ascending order of regno.
		Set<Employee> ts = new TreeSet<>();
		ts.add(new Employee(200, "Soumen Dey", 25000));
		ts.add(new Employee(100, "Manoj Kumar", 35000));
		ts.add(new Employee(150, "Soma Sarkar", 40000));
		ts.add(new Employee(150, "Ritam Sen", 28000));
		ts.add(new Employee(120, "Rahul Roy", 45000));
		ts.add(new Employee(80, "Rohit Singh", 38000));
		ts.add(new Employee(160, "Surya Rajdan", 30000));
		System.out.println(ts);
		System.out.println();
		
		// In ascending order of name.
		ts = new TreeSet<>(new CustomEnameAscComparator());
		ts.add(new Employee(200, "Soumen Dey", 25000));
		ts.add(new Employee(100, "Manoj Kumar", 35000));
		ts.add(new Employee(150, "Soma Sarkar", 40000));
		ts.add(new Employee(150, "Ritam Sen", 28000));
		ts.add(new Employee(120, "Rahul Roy", 45000));
		ts.add(new Employee(80, "Rohit Singh", 38000));
		ts.add(new Employee(160, "Surya Rajdan", 30000));
		System.out.println(ts);
		System.out.println();
		
		// In descending order of basic
		ts = new TreeSet<>(new CustomBasicDescComparator());
		ts.add(new Employee(200, "Soumen Dey", 25000));
		ts.add(new Employee(100, "Manoj Kumar", 35000));
		ts.add(new Employee(150, "Soma Sarkar", 40000));
		ts.add(new Employee(150, "Ritam Sen", 28000));
		ts.add(new Employee(120, "Rahul Roy", 45000));
		ts.add(new Employee(80, "Rohit Singh", 38000));
		ts.add(new Employee(160, "Surya Rajdan", 30000));
		System.out.println(ts);
		System.out.println();
	}
}
