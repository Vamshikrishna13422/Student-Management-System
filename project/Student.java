package project;

public class Student {
	private String StdName;
	private int StdID;
	private String Courses;
	private double Balance;
	public double CourseFee;
	private double paidfee;
	
public Student() {
	
}
	
	
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public double getCourseFee() {
		return CourseFee;
	}
	public void setCourseFee(double courseFee) {
		CourseFee = courseFee;
	}
	public double getPaidfee() {
		return paidfee;
	}
	public void setPaidfee(double paidfee) {
		this.paidfee = paidfee;
	}
	
	
}
