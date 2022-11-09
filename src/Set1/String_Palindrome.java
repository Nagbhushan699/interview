package Set1;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="madam";
        String rev="";
        String Forrev=" ";
        String backRev=" ";
//        for (int i = 0; i < s.length(); i++) {
//			Forrev +=String.valueOf(s.charAt(i));
//		}
//        for (int i = s.length()-1; i >= 0; i--) {
//        	backRev +=String.valueOf(s.charAt(i));
//		}
//        if(Forrev.equals(backRev)) {
//        	System.out.println(s+" is palindrome ");
//        }
//        else {
//        	System.out.println(s+" is not palindrome ");
//        }
        int length=s.length();
        for (int i = (length-1); i >=0; --i) {
			rev=rev+s.charAt(i);
			
		}
        System.out.println(rev+" reverse string");
        System.out.println(s+" original string");

        if (s.equals(rev)) {
          System.out.println(s + " is a Palindrome String.");
        }
        else {
          System.out.println(s + " is not a Palindrome String.");
        }
	}

}
