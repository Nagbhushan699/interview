package Set1;

public class Count_Words_From_String {

	public static void main(String[] args) {
		//13. WAP to Count the number of character 'w' in below sentence.
	String s="I would like to work smart than hard work";
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)=='w') {
			count++;
		}
	}
	System.out.println("The count of 'w' character is : "+count);

	}

}
