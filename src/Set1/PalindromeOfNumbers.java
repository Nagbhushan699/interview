package Set1;

public class PalindromeOfNumbers {

	//3. Write a program to check if given number is palindrome
	public static void main(String[] args) {
	  int num=501;
	  int temp=num;
	  int rem,rev=0;
	  while(num!=0) {
		  rem=num%10;
		  rev=rev*10+rem;
		  num=num/10;
	  }
	  if(temp==rev) {
		  System.out.println(temp+" is a palindrome num");
	  }
	  else {
		  System.out.println(temp+" is not palindrome num");
	  }
}
}