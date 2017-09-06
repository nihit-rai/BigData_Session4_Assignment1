import java.util.Scanner;

public class Acad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter integer 1 : ");
		int a = sc.nextInt();
		System.out.print("Please enter integer 2 : ");
		int b = sc.nextInt();
		
		Acad acad = new Acad();
		acad.sum(a, b);
	}
	
	public void sum(int a, int b)
	{
		System.out.println("First number is: "+ (a));
		System.out.println("Second number is: "+ (b));
		System.out.println("Sum is: "+ (a+b));
	}

}
