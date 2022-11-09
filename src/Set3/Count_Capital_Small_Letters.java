package Set3;

public class Count_Capital_Small_Letters {

	public static void main(String[] args) {
		String s="I Would Like to Work Smart than hard work";
		int cap=0;
		int lower=0;
		for (int i = 0; i < s.length(); i++) {
			
			if(Character.isLowerCase(s.charAt(i))) {
				lower++;
			}
			else if(Character.isUpperCase(s.charAt(i))) {
				cap++;
			}
		}
      System.out.println("Count no of lower case letters : "+lower);
      System.out.println("Count no of upper case letters : "+cap);
	}

}
