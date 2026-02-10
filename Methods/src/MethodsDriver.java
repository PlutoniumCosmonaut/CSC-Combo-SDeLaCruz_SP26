public class MethodsDriver {

	//access modifier "static"   return type   name
	public static void threeLine()
	{
	System.out.println();
	System.out.println();
	System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		threeLine();
		System.out.println("World");
		String str = "print this again";
		printTwice(str);
		
		int hour = 9;
		int minute = 55;
		printTime(hour, minute);
		System.out.println("\n" + hour);
		
		double root = Math.sqrt(17.0);
		double angle = 1.5;
		double height = Math.sin(angle);
		
		System.out.println(root +"\n" + angle + "\n" + height);
		
		double radius = 20;
		double area = calculateArea(radius);
		System.out.println(area);
	}

	private static double calculateArea(double radius) {
		double result = Math.PI * radius * radius;
		return result;
	}

	private static void printTime(int hour, int minute) {
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
	
	}
	private static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
		
		
		
		
	}

}
