package Set1;

public class Remove_Duplicates_From_String {

	public static void main(String[] args) {
	  String str="Bhhaalerao";
	  String re="";
	  for (int i = 0; i <= str.length()-1; i++) {
		  if(!re.contains(String.valueOf(str.charAt(i)))) {
			  re +=String.valueOf(str.charAt(i));
		  }
	}
		
   System.out.println(" Original String : "+re);
}
}