package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */

		int array[]= pattern(100);
		for (int i=0;i<array.length;i++)
			System.out.print(array[i]+", ");


	}
public static int[] pattern(int range){
	int count = 0;
	int k=0;
	int i = 0;
	int j = 1;
	// declare an array to assign to it the elements of the pattern
	// and since we don't know its length we will consider the maximum possible length
	int array[]=new int[range];
		//System.out.println("the pattern is: ");
		while(count<=10&&i<=range)

	{
		if (i % j == 0) {
			//System.out.print((100 - i) + ", ");
			array[k]=100 - i;
			k++;// to count the limit index
			count++;
		}


		i++;
		if (count == 11) {
			count = 1;
			j++;

		}

	}
		// transfer the array to new array ar that have the exact length
		int ar[]=new int[k];
	for (int s=0;s<k;s++){
		ar[s]=array[s];

	}
		return ar;
}
}
