package project;
import java.util.*;
public class StudentImplementation implements StudentInterface {
	
	Student s=new Student();
	Map<Double,String> status=new HashMap<>();
	Map<String,String> course=new HashMap<>();

	@Override
	public void Viewcourses() {
		System.out.println("Choose your course:\n 1.Java Full Stack\n 2.Python\n 3.AWS\n 4.Embedded System\n 5.VLSI");
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			course.put("courseName:","JavaFullStack");
			System.out.print("Course fee for Java Full Stack:");
			s.setCourseFee(50000.00);
			System.out.println(s.getCourseFee());
			break;
		case 2:
			System.out.print("Course fee for Python:");
			s.setCourseFee(70000.00);
			System.out.println(s.getCourseFee());
			break;
		case 3:
			System.out.print("Course fee for AWS:");
			s.setCourseFee(65000.00);
			System.out.println(s.getCourseFee());
			break;
		case 4:
			System.out.print("Course fee for Embedded System:");
			s.setCourseFee(90000.00);
			System.out.println(s.getCourseFee());
			break;
		case 5:
			System.out.print("Course fee for VLSI :");
			s.setCourseFee(95000.00);
			System.out.println(s.getCourseFee());
			break;
			default:
				System.out.println("Invalid choice");
			
			
		}
		
	}

	@Override
	public void ViewStatus() {
		for(Map.Entry<String, String>c:course.entrySet()) {
			System.out.println(c.getKey()+" "+c.getValue());
		}
		for(Map.Entry<Double, String>m:status.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		ViewBalance();
		if(s.getBalance()==0) {
			System.out.println("successfully course is enrolled by student");
		}
		
	}

	@Override
	public void ViewBalance() {
		System.out.println("Remaining amount to pay for the course is:"+s.getBalance());
		
	}

	@Override
	public void paidfee(double paidfee) {
		status.put(paidfee, "Course Amount Paid by Student");
		System.out.println(paidfee+"Paid Successfully!");
		s.setBalance(s.getCourseFee()-paidfee);
		s.setCourseFee(s.getBalance());
		ViewBalance();
	}

	
	

	
	
	
}
