package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		pattern();


	}
public static void pattern(){
	int count = 0;
	int i = 0;
	int j = 1;
		System.out.println("the pattern is: ");
		while(count<=10&&i<=100)

	{
		if (i % j == 0) {
			System.out.print((100 - i) + ", ");
			count++;
		}


		i++;
		if (count == 11) {
			count = 1;
			j++;

		}

	}
}
}
