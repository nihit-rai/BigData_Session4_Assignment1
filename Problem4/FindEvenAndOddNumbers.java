import java.util.ArrayList;
import java.util.Scanner;

public class FindEvenAndOddNumbers {

	public ArrayList<Integer> evenList =new ArrayList<Integer>();
	public ArrayList<Integer> oddList=new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter integer 1 : ");
		int a = sc.nextInt();
		System.out.print("Please enter integer 2 : ");
		int b = sc.nextInt();
		FindEvenAndOddNumbers obj = new FindEvenAndOddNumbers();
		if(a>b)
		{
			obj.findEvenOdd(b, a);
		}
		else
		{
			obj.findEvenOdd(a, b);
		}
		System.out.print("Even numbers: ");
		for(int i : obj.evenList)
		{
			System.out.print(i +", ");
		}
		System.out.println();
		System.out.println();
		System.out.print("Odd numbers: ");
		for(int i : obj.oddList)
		{
			System.out.print(i +", ");
		}
	}
	
	public void findEvenOdd(int smallerNum, int biggerNum)
	{
		for(int i=smallerNum; i<=biggerNum; i++)
		{
			if(i%2 == 0)
			{
				this.evenList.add(i);
			}
			else
			{
				this.oddList.add(i);
			}
		}
				
	}

}
