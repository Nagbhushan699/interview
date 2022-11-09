package Set2;

public class String_Palindrome {

	public static void main(String[] args) {
	String s="madam";
	String rev="";
	
	for (int i = s.length()-1; i >=0; --i) {
		rev+=String.valueOf(s.charAt(i));
	}
	System.out.println(" reverse string : "+rev);
	if(rev.equals(s)) {
		System.out.println(s+" is palindrome");
	}
	else {
		System.out.println(s+" is not palindrome");
	}

	}

}
