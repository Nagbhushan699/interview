package Set1;

public class String_Palindrome_Ex2 {

	public static void main(String[] args) {
	   String str="madam";
	   String rev="";
	   int strLength=str.length();
	   for (int i =(strLength-1); i >= 0; --i) {
		rev=rev+String.valueOf(str.charAt(i));
	}
	   if(rev.equals(str)) {
		   System.out.println(str+" is palindrome String");
	   }
	   else {
		   System.out.println(str+" is not  palindrome String");
	   }

	}

}
