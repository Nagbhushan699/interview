package Set3;

public class Count_No_From_String {

	public static void main(String[] args) {
		String s="Bhushan@123456";
		int count=0;
		int c=0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))){
				count++;
			}
		}
		System.out.println("Count of digits from string is : "+count);

	}

}
