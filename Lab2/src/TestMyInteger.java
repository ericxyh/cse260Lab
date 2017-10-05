
public class TestMyInteger {
	
	public static void main(String[] args) {
		MyInteger x = new MyInteger(97);
		MyInteger y = new MyInteger(MyInteger.parseInt("360"));
		System.out.println(x.getValue());
		System.out.println(y.getValue());
		System.out.println(x.equals(y));
		System.out.println(y.equals(360));
		System.out.println(y.isEven());
		System.out.println(y.isOdd());
		System.out.println(x.isPrime());
		System.out.println(MyInteger.isEven(23));
		System.out.println(MyInteger.isEven(y));
		System.out.println(MyInteger.isOdd(14));
		System.out.println(MyInteger.isOdd(y));
		System.out.println(MyInteger.isPrime(2));
		System.out.println(MyInteger.isPrime(x));
	}
}
