package Set1;

public class Max_Value_From_Array {

	public static void main(String[] args) {
		//10. Write a Java program to find out the maximum values from an array?
		
		int i[]= {10,20,30,40,50,60};
       int max=i[0];
       for (int j = 0; j < i.length; j++) {
		if(i[j]>max) {
			max=i[j];
		}
	}
       System.out.println(max+" is maximum no");
	}

}
