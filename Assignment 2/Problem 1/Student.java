
public class Student {
	
	private String name;
	private String major;
	private double gpa;
	
	public Student() {
		//...
	}
	public Student(String name, String major) {
		this.name = name;
		this.major = major;
	}
	public Student(String name, String major, double gpa) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
	public String getName() {
		return this.name;
	}
	public String getMajor() {
		return this.major;
	}
	public double getGpa() {
		return this.gpa;
	}
	public void setName(String name) { 
		this.name = name;
	}
	public void setMajor(String major) { 
		this.major = major;
	}
	public void setGpa(double gpa) { 
		this.gpa = gpa;
	}
	public String toString() {
		return "Name: " + this.name + "\nMajor: " + this.major + "\nGPA: " + this.gpa;
	}
	public boolean equals(Student student) {
		return this.name.equals(student.name) && this.major.equals(student.major) && this.gpa == student.gpa;
	}
}
