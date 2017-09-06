import java.util.ArrayList;
import java.util.Scanner;

public class FindFirstTenMultiples {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		int a = sc.nextInt();
		FindFirstTenMultiples findFirstTenMultiples = new FindFirstTenMultiples();
		findFirstTenMultiples.getFirstTenMultiples(a);	
	}
	
	public void getFirstTenMultiples(int i)
	{
		for(int x=1; x<=10; x++)
		{
			System.out.println(i +" X "+ x + " = "+ (i*x));
		}
	}

}
