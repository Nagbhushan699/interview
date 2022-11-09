package Set3;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
		String s1="radius";
		String s2="radi";
		
		if(s1.length()==s2.length()) {
			s1.toLowerCase();
			s2.toLowerCase();
			char[]c1=s1.toCharArray();
			char[]c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				System.out.println(s1+" and "+s2+" are  string anagrams");
			}
			else {
				System.out.println(s1+" and "+s2+" are not string anagrams");
			}
		}
		else {
			System.out.println(s1+" and "+s2+" are not string anagrams");
		}
	}

}
