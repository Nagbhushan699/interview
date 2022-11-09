package Set2;

public class Reverse_String {

	public static void main(String[] args) {
		// Print given string in reverse with or without using loop
    
		
		String s="Nagbhushan";
//		for (int i = s.length()-1; i >0; i--) {
//			System.out.print(s.charAt(i));
//		}

		
		StringBuilder str=new StringBuilder(s);
		str.reverse();
		System.out.println("reversed string without using loop : "+str);
		
	}

}
