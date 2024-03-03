package com.jbs.models;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int roll;
	private String sname;
	private String semail;
	private static int counter;
	static {
		counter = 100;
	}
	public Student() {
		super();
		this.roll = ++counter;
	}
	public Student(String sname, String semail) {
		super();
		this.roll = ++counter;
		this.sname = sname;
		this.semail = semail;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Student.counter = counter;
	}
	@Override
	public int hashCode() {
		return Objects.hash(semail, sname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(semail, other.semail) && Objects.equals(sname, other.sname);
	}
	@Override
	public String toString() {
		return "\nStudents [roll=" + roll + ", sname=" + sname + ", semail=" + semail + "]";
	}
	@Override
    public int compareTo(Student otherStudent) {
        // Implement comparison logic based on your requirements
        return this.sname.compareTo(otherStudent.sname);
    }
}
