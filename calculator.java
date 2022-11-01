public class Calculator {
	public static void main(String[] args) {
	int myFirstVal = 0;
	int mySecondVal = 0;
	float quotient = 0;
	
	myFirstVal = Integer.parseInt(args[0]);
	mySecondVal = Integer.parseInt(args[1]);
	quotient = myFirstVal / mySecondVal;

	System.out.println(quotient);
	

	double radius = Double.parseDouble(args[0]);
	double area = Math.PI*(double)(Math.pow(radius, 2));
	System.out.println("The area is: "+ area ); 
	}

}
