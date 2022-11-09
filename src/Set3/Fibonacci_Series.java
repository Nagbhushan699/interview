package Set3;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// 10. Fibonacci

//		 int n1=0,n2=1,n3,i,count=10;    
//		 System.out.print(n1+" "+n2);//printing 0 and 1    
//		    
//		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
//		 {    
//		  n3=n1+n2;    
//		  System.out.print(" "+n3);    
//		  n1=n2;    
//		  n2=n3;    
//		 }   
		 
		 
		 int a1=0,a2=1,a3,count=8;	 
		 System.out.print(a1+" "+a2);
      for (int i = 2; i <count; i++) {
		a3=a1+a2;
		System.out.print(" "+a3);
		a1=a2;
		a2=a3;
	}
	}

}
