package Set1;

public class Number_Pattern {

	public static void main(String[] args) {
		/*11. Write a program to print below pattern.
		1
		2 2
		3 3 3
		4 4 4 4
		5 5 5 5 5
		6 6 6 6 6 6
		7 7 7 7 7 7 7
		*/
		
		for (int i = 1; i <7; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
