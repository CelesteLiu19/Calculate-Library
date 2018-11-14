
public class Quadratic {
		public static double discriminant(double a, double b, double c) {
			return(b * b - (4 * a * c));
		}
		public static double round2(double num) {
			double ifRoundUp = (num + 0.005);
			double hundred = (double)ifRoundUp * 100;
			int intHundred = (int)hundred;
			double newNum = (double)intHundred / 100;
			return newNum;
		}
		public static double sqrt(double num) {
			if (num < 0) {
				throw new IllegalArgumentException("Input must be a positive integer");
			}
			else {
				double estimate = (num / 2);
				while(Quadratic.absValue((estimate * estimate) - num) >= 0.005) {
					estimate = (0.5 * ((num / estimate) + estimate));
				}
				return Quadratic.round2(estimate);
			}
		}
		public static double absValue(double num) {
			if (num > 0) {
				return(num);
			}
			else {
				return(num*-1);
			}
		}
		public static String quadForm(double a, double b, double c) {
			if(Quadratic.discriminant(a, b, c) < 0) {
				return "No roots";
			}
			else if(Quadratic.discriminant(a, b, c) == 0) {
				return "One root: 0" ;
			}
			else {
				double small;
				double large;
				double discriminant = Quadratic.discriminant(a, b, c);
				double twoRootAdd = (-b + discriminant) / (2 * a);
				double twoRootMinus = (-b - discriminant) / (2 * a);
				if(twoRootAdd < twoRootMinus) {
					small = twoRootAdd;
					large = twoRootMinus;
				}
				else {
					small = twoRootMinus;
					large = twoRootAdd;		
				}
				return "Two Roots: " + Quadratic.round2(small) + " and "+ Quadratic.round2(large);
			}
		}
		public static String quadDescriber(double a, double b, double c) {
			String directionOpen;
			String axisOfSymmetry;
			String vertex;
			String xIntercept;
			String yIntercept;
			//String discriptionHeader = "Description of the graph of:";
			String equation = (a + "x^(2) + " + b + "x + " + c);
			
			if(a > 0) {
				directionOpen = "Opens: Up"; 
			}
			else {
				directionOpen = "Opens: Down";
			}
			
			double x = -b / 2 * a;
			double y = a * (x * x) + (b * x) + c;
			
			axisOfSymmetry = "Axis of Symmetry: " + x;
			
			vertex = "Vertex = (" + x + ", " + y + ")";
			
			xIntercept = "x-intercept(s): " + Quadratic.quadForm(a, b, c);
			
			yIntercept = "y-intercept: " + c;
			
			System.out.println("Description of the graph of: ");
			System.out.println("y =  " + equation);
			System.out.println("");
			System.out.println(directionOpen);
			System.out.println(vertex);
			System.out.println(axisOfSymmetry);
			System.out.println(xIntercept);
			System.out.println(yIntercept);
		
			return "";
		}
}

