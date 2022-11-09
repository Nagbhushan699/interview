package Set3;

public class Remove_Duplicate_Characters_From_String {

	public static void main(String[] args) {
		// 6. Remove duplicate characters from string

		String s="Ammooll";
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			if(!rev.contains(String.valueOf(s.charAt(i)))) {
				rev+=String.valueOf(s.charAt(i));
			}
		}
      System.out.println("original string : "+rev);
	}

}
