package Set3;

public class Second_Max_No_From_Array {

	public static void main(String[] args) {
		// 26) from the int array find 2nd maximum number
		int a[]= {25,10,17,44,12,40};
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
        System.out.println(" second maximum no from array : "+a[a.length-2]);
	}

}
