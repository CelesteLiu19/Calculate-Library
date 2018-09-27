/* This class contains the methods to do various math related tasks.
 * @author Celeste Liu
 * @version September 6, 2018
 */
public class Calculate {

	public static int square(int num) {
		return num*num; // squares a number
	}
	public static int cube(int num) {
		return num*num*num; // cubes a number
	}
	public static double average(double num1, double num2) {
		return (num1 + num2)/2; // takes the average of two numbers 
	}
	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3)/3; // takes the average of three numbers
	}
	public static double toDegrees(double rad) {
		return(rad * 180 / 3.14159); // converts radians to degrees
	}
	public static double toRadians(double deg) {
		return(deg * 3.14159 / 180); // converts degrees to radians
	}
	public static double discriminant(double a, double b, double c) {
		return(b * b - (4 * a * c)); // finds the discriminant of three numbers 
	}
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		return((whole * denominator + numerator) + "/" + denominator); // turns a mixed number to an improper fraction	
	}
	public static String toMixedNum(int numerator, int denominator) {
		return((numerator / denominator) + "_"  + (numerator % denominator) + "/" + denominator); // turns an improper fraction to a mixed number
	}
	public static String foil(int num1, int num2, int num3, int num4, String n) {
		return(num1 * num3 + n + "^2 + " + (num1 * num4 + num2 * num3) + n + " + " + (num2 * num4)); // foils two binomial 
	}
	public static boolean isDivisibleBy(int num1, int num2 ) {
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			return true;
		}
		else {
			return false;
		} // determines whether one of the numbers is divisible by the other
	}
	public static double absValue(double num) {
		if (num > 0) {
			return(num);
		}
		else {
			return(num*-1);
		}
		// finds the absolute value of a number
		//return Math.abs(a);
	}
	public static double max(double num1, double num2) {	
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
		// finds the max of 2 numbers
		//return Math.max(a, b);
	}	
	public static double max(double num1, double num2, double num3) {
		if (num1 > num2) {
			if (num1 > num3) {
				return num1;
			}
			else return num3;
		}
		else if ( num1 < num2) {
			if (num2 > num3) {
				return num2;
			}
			else return num3;
		}
		else if (num1 > num3) {
			return num1;
		}
		else return num3;
		// finds the max of three numbers
		//return Math.max(a,Math.max(b,c)); 
	}
	public static double min(double num1, double num2) {	
		if (num1 < num2) {
			return num1;
		}
		else {
			return num2;}
		// finds minimum of two numbers
		}
	public static double min(double num1, double num2, double num3) {
		if (num1 < num2) {
			if (num1 < num3) {
				return num1;
			}
			else return num3;
		}
		else if ( num1 > num2) {
			if (num2 < )num3 {
				return num2;
			}
			else return num3;
		}
		else return num3;
		// finds the minimum of three numbers
		// return Math.min(a,Math.min(b,c)); 
}
	public static double round2(double num) {
		double newnum = (num + 0.005) * 100;
		newnum = (int) num / 100.0;
		return newnum;
		// rounds to two decimal places
		//return(Math.round(a*100)/100.0);
	}
	public static double exponent(double base, int exp) {
		double answer = base;
		if (exp == 0) {
			return 1;
		}
		else {
			for (int i = 1;i < exp; i++) {
				answer = answer * base;
			}
			return answer;
		}
		// this multiplies the base number by the number of exponents
	}
	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		}
		else {
			for(int i = num - 1;i > 0;i--) {
				num = num * i;
			}
		}
		return num;
		// this produces a factorial 
	}
	public static boolean isPrime(int num) {
		if (num == 1 || num == 2) {
			return true;
		}
		if (num % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
		// this determines if the number is a prime number
	}
	public static int gcf(int num1, int num2) {
		int bigger = (int) Calculate.max(num1,num2);
		int smaller = (int) Calculate.min(num1,num2);
		int count = smaller;
		while(count > 1) {
			if(bigger % count == 0 && smaller % count == 0) {
				return count;
			}
			else {
				count--;
			}
		}
		return 1;
		// finds the greatest common factor of two numbers
	} 
	public static double sqrt(double a) {
		double ans = 10;
		while(Calculate.absValue((ans * ans) - a) > 0.0001) {
			ans =(0.5) * ((a / ans) + ans);
		}
		return Calculate.round2(ans);
		//this finds the square root of a number and rounds it to the second decimal place
	}
}
	














