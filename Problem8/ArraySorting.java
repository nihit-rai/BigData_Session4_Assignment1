
public class ArraySorting {

	public static void main(String[] args) {
		int[] arr={2,4,7,23,65,21,754,13,764,25,543,765,33,1,65};
		ArraySorting arraySorting = new ArraySorting();
		int[] sortedArray = arraySorting.bubbleSortDescending(arr);
		
		for(int i : sortedArray)
		{
			System.out.print(i +" ");
		}

	}
	
	public int[] bubbleSortDescending(int[] arr)
	{
		int[] ret = arr;
		for (int i = 0; i < ret.length; i++) {
	        for (int j = i + 1; j < ret.length; j++) {
	            int tmp = 0;
	            if (ret[i] < ret[j]) {
	                tmp = ret[i];
	                ret[i] = ret[j];
	                ret[j] = tmp;
	            }
	        }
	    }
		return ret;
	}

}
