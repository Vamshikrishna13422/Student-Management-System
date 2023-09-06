package project;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentImplementation s=new StudentImplementation();
		
		String StdName="STUDENT";
		int stdID =23456;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter student name:");
		String name=obj.next();
		System.out.println("Enter student id");
		int id=obj.nextInt();
		
		if((StdName.equals(name))&&(stdID==id))
		{
			//System.out.println("Student");
			while(true)
			{
				System.out.println("1.ViewCourse\n 2.ViewStatus\n 3.ViewBalance\n 4.paidfee");
				System.out.println("Enter your choice");
				int n=obj.nextInt();
				if(n==1)
				{
					s.Viewcourses();
				}
				else if(n==2)
				{
					System.out.println("Student Status");
					System.out.println("name:"+name);
					System.out.println("id:"+id);
					//System.out.println("name:"+name);
					//System.out.println("Balance:"+"Balance");
					s.ViewStatus();
					
				}
				else if(n==3) {
					s.ViewBalance();
				}
				else if(n==4) {
					
					System.out.println("Enter the Amount to pay for the course");
					double paidAmount=obj.nextDouble();
					s.paidfee(paidAmount);
					
				}
			}
		}
		else {
			System.out.println("Students details not found..!!! please enter correct details....");
			System.exit(0);
		}
		
		
	}

}
