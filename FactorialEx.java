public class FactorialEx {
	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		int output = 1;
		while (input > 1) {
			output *= input;
			input = input - 1;
		}
		System.out.println(output);
	}
}