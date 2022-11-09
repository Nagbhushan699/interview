package Set3;

public class Occurences_Of_Character {

	public static void main(String[] args) {
		String s="I would like to work smart than hard work";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='w') {
				count++;
			}
		}
      System.out.println("count of words : "+count);
	}

}
