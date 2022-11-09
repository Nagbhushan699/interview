package Set2;

public class Number_Palindrome {

	public static void main(String[] args) {
	  int no=501;
	   int temp=no;
	   int rem,rev=0;
	   
	   while(no!=0) {
		   rem=no%10;
		   rev=rev*10+rem;
		   no=no/10;
	   }
	  if(temp==rev) {
		  System.out.println(temp+" is palindrome");
	  }
	  else {
		  System.out.println(temp+" is not palindrome");
	  }

	}

}
