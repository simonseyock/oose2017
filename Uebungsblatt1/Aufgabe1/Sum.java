public class Sum {
	public static void main(String[] args) {
		try {
			int res = 0;
			for (String arg : args) {
				res += Integer.parseInt(arg);
			}
			System.out.println("Sum: " + res);
		}
		catch (java.lang.NumberFormatException e) {
			System.out.println("The programm only accepts integers.");
		}
	}
}