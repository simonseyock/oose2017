import java.security.InvalidParameterException;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("factorial(6):    " + factorial(6));
		System.out.println("factorial(43):   " + factorial(43));

		System.out.println("Long.MAX_VALUE:  " + Long.MAX_VALUE);
		System.out.println("factorial(20):   " + factorial(20));
		System.out.println("factorial(21):   " + factorial(21));

		System.out.println("binomial(49, 6): " + binomial(49, 6));
		System.out.println("lotto(49, 6):    " + lotto(49, 6));
	}

	public static long factorial(long n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	// Schlecht geeignet für große n

//	public static long binomial(long n, long k) {
//		if (n < 0 || k < 0) {
//			throw new InvalidParameterException("Both parameters should be >= 0");
//		}
//		if (n >= k) {
//			return factorial(n) / (factorial(k) * factorial(n - k));
//		} else {
//			return 0;
//		}
//	}

	public static long binomial(long n, long k) {
		if (n < 0 || k < 0) {
			throw new InvalidParameterException("Both parameters should be >= 0");
		}
		if (n >= k) {
			long numerator = 1;
			long denominator = 1;
			for (int i = 1; i <= k; i++) {
				numerator *= (n - i + 1);
				denominator *= i;
			}
			return numerator / denominator;
		} else {
			return 0;
		}
	}

	public static long lotto(long n, long k) {
		return binomial(n, k) * factorial(k);
	}

}
