package Set3;

public class Count_Duplicate_Characters_From_String {

	public static void main(String[] args) {
		//17) Suppose my string s= "My name is Vinayak"
		//So write the program for to find duplicate character in string with its occurance times
		String s= "My name is Vinayak";
		
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(!s.contains(String.valueOf(s.charAt(i)))) {
				count++;
			}
		}
		System.out.println(count);

	}

}
