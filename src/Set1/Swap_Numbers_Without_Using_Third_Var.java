package Set1;

public class Swap_Numbers_Without_Using_Third_Var {
//1. Write a Java program to swap two numbers without using third variable?
	public static void main(String[] args) {
	   int a=10;
	   int b=20;
	   a=a+b;
	   b=a-b;
	   a=a-b;
	   System.out.println("a :"+a);
	   System.out.println("b :"+b);
	}

}
