package Set3;

public class Factorial_No {

	public static void main(String[] args) {
		//9. factorial

		int no=5;
		int fact=1;
		for (int i = 1; i <= no; i++) {
			fact=fact*i;
		}
       System.out.println("Factorial of "+no+" is : "+fact);
	}

}
