
import java.util.Scanner;

class Squareandcube
{
	void Square_display(int last_num)
	{
		for(int i=1;i<=last_num;i++)
		{
			System.out.println(i+"^2="+(i*i));
		}
	}
	void Cube_display(int last_num)
	{
		for(int i=1;i<=last_num;i++)
		{
			System.out.println(i+"^3="+(i*i*i));
		}
	}
}

public class ShapeDemo
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num = in.nextInt();
		
		Squareandcube s_c = new Squareandcube();
	    System.out.println("Square of first "+num+" number:");
	    s_c.Square_display(num);
	    System.out.println("Cube of first "+num+" number:");
	    s_c.Cube_display(num);	
	}
}