package Set1;

public class Pyramid_Pattern {

	public static void main(String[] args) {
		/*12. WAP to print the Pyramid pattern using for loop

	     * 
	    * * 
	   * * * 
	  * * * * 
	 * * * * * 
	* * * * * * 
	* */
		
		 for (int i = 1; i <=6; i++) {
			for (int j = 1; j < 6-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
