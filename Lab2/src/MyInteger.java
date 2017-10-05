
public class MyInteger {

	private int value;
	
	public MyInteger(int val) {
		value = val;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return value % 2 == 0;
	}
	
	public boolean isOdd() {
		return value % 2 == 1;
	}
	
	public boolean isPrime() {
		if (getValue() <= 3) {
			return getValue() == 2 || getValue() == 3;
		}
		else {
			int root = (int) (Math.sqrt(getValue()));
			for (int i = 2; i <= root; i++) {
				int quotient = getValue() / i;
				if (i * quotient == getValue()) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static boolean isOdd(int n) {
		return n % 2 == 1;
	}
	
	public static boolean isPrime(int n) {
		if (n <= 3) {
			return n == 2 || n == 3;
		}
		else {
			int root = (int) (Math.sqrt(n));
			for (int i = 2; i <= root; i++) {
				int quotient = n / i;
				if (i * quotient == n) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static boolean isEven(MyInteger n) {
		return n.isEven();
	}
	
	public static boolean isOdd(MyInteger n) {
		return n.isOdd();
	}
	
	public static boolean isPrime(MyInteger n) {
		return n.isPrime();
	}
	
	public boolean equals(int n) {
		return getValue() == n;
	}
	
	public boolean equals(MyInteger n) {
		return getValue() == n.getValue();
	}
	
	public static int parseInt(String num) {
		int answer = 0;
		for (int i = 0; i < num.length(); i++) {
			int parsed = (int) (num.charAt(i));
			answer *= 10;
			answer += (parsed - 48);
		}
		return answer;
	}
}
