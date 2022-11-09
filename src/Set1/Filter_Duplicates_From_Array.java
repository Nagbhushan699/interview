package Set1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Filter_Duplicates_From_Array {
//8. Write code to filter duplicate elements from an array and print as a list?
	public static  void fun(Integer a[]) {
		Set<Integer>set=new HashSet<Integer>();
        for (int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
        List <Integer>list=new ArrayList<Integer>(set);
        System.out.println(list);
	}
	public static void main(String[] args) {
		Integer a[]= {1,2,3,4,4,3,5};
         fun(a);
	}

}
