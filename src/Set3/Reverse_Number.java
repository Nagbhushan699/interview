package Set3;

public class Reverse_Number {

	public static void main(String[] args) {
		//8. Reverse number

		int no=7888;
		
		int temp=no;
		int rem,rev=0;
		
		while(no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("reverse no : "+rev);
		
		

	}

}
