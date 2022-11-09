package Set1;

public class Prime_No {

	public static void main(String[] args) {
		// 9. Write a method to check prime no. in Java?
  
		int no=9;
		int check=0;
		for (int j = 2; j < no; j++) {
			if(no%j==0) {
				check++;
			}
		}
		if(check>0) {
			System.out.println(no+" is not prime no");
		}
		else {
			System.out.println(no+" is  prime no");
		}
	}

}
