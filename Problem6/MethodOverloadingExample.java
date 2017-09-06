

public class MethodOverloadingExample {

	public static void main(String[] args) {
		int[] arr={2,4,7,23,65,21,754,13,764,21,543,765,23,1,65};
		MethodOverloadingExample obj = new MethodOverloadingExample();
		System.out.println(obj.sum(10, 21));
		System.out.println(obj.sum(10, 21, 19));
		System.out.println(obj.sum(arr));
	}

	public int sum(int a, int b)
	{
		int ret=a+b;
		System.out.print("Sum of two parameters: ");
		return ret;
	}
	
	public int sum(int a, int b, int c)
	{
		int ret=a+b+c;
		System.out.print("Sum of three parameters: ");
		return ret;
	}
	
	public int sum(int[] intArray)
	{
		int ret=0;
		System.out.print("Sum of arraylist as parameter: ");
		for(int i: intArray)
		{
			ret = ret+i;
		}
		return ret;
	}
}
