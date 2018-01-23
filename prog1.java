import java.util.*;
import java.io.*;

public class prog1
{
	public static void main(String args[])
	{
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("Sum of %d and %d is %d\n",a,b,a+b);
	}
}