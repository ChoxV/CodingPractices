
import java.util.Scanner;

class Student
{
	private String name;
	
	public void inputName(String studentName)
	{
		this.name = studentName;
	}
	
	public String getName()
	{
		return name;
	}
	public String average(int mark1,int mark2,int mark3)
	{
		double averageMarks = (mark1+mark2+mark3)/3.0;
		return averageMarks>50?"Passed":"Failed";
	}
}

public class StudentData {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Enter the name of the student: ");
		String studentName = scanner.nextLine();
		student.inputName(studentName);
		
		System.out.println("Enter marks for 3 examinations:");
		System.out.print("Mark 1: ");
		int marks1 = in.nextInt();
		System.out.println("Mark 2: ");
		int marks2 = in.nextInt();
		System.out.println("Mark 3: ");
		int marks3 = in.nextInt();
		
		System.out.println("\nStudent Name: "+student.getName());
		System.out.println("Result: "+student.average(marks1, marks2, marks3));
	}
}
