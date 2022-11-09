package Set2;

public class Greatest_Three_Numbers {

	public static void main(String[] args) {
		int a=10,b=30,c=50;
		
		if(a>b && a>c) {
			System.out.println(a+" is greatest");
		}
		else if(b>c) {
			System.out.println(b+" is greatest");
		}
		else {
			System.out.println(c+" is greatest");
		}
	}

}
