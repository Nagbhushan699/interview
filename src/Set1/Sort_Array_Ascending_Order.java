package Set1;

public class Sort_Array_Ascending_Order {
//6. Write a program to sort the array in ascending order.
	public static void main(String[] args) {
		int[] arr= {10,3,1,5,20};
         int temp;
        for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
      for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
}