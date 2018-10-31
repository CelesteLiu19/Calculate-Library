/* This is the client code for the Calculate Library
 * @author Celeste Liu
 * @version September 6, 2018
 */
public class DoMath {
// this is a class to do math calculations
	public static void main(String[] args) {
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.cube(-3));
		System.out.println(Calculate.average(6,2));
		System.out.println(Calculate.average(6,2,1));
		System.out.println(Calculate.toDegrees(1));		
		System.out.println(Calculate.toRadians(57.3));
		System.out.println(Calculate.discriminant(1,2,1));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,3,6,-7,"n"));
		System.out.println(Calculate.isDivisibleBy(10,5));
		System.out.println(Calculate.absValue(-5));
		System.out.println(Calculate.max(3,7));
		System.out.println(Calculate.max(1,2,3));
		System.out.println(Calculate.min(0,5,8));
		System.out.println(Calculate.round2(4.8697465435));
		System.out.println(Calculate.exponent(2,3));
		System.out.println(Calculate.factorial(6));
		System.out.println(Calculate.isPrime(4));
		System.out.println(Calculate.gcf(16, 20));
		System.out.println(Calculate.sqrt(5));	
	} 
}
