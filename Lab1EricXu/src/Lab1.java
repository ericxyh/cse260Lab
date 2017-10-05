import javax.swing.JOptionPane;
import java.util.Scanner;

public class Lab1 {
	public static String readNum(String s) {
		char[] list = new char[10];
		int len = 0;
		for (int i = 0; i < s.length(); i++) {
			char digit = s.charAt(i);
			if (s.indexOf(digit) == i) {
				list[len] = digit;
				len++;
			}
		}
		String result="";
		for (int i = 0; i <= len; i++) {
			result += list[i];		
		}
		return result;
	}
	
	public static long sortTime() {
		int[] sortee = randomArray();
		long startTime = System.currentTimeMillis();
		binarySearch(sortee, 142);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		return executionTime;
	}
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
					high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1 - low;
	}
	
	public static int[] randomArray() {
		int[] result= new int[1000000];
		for (int i = 0; i < result.length; i++) {
			int j = (int) (Math.random() * result.length);
			 result[i] = j;
		}
		return result;
	}
	
	public static void tictactoe() {
		int[][] board = new int[3][3];
		boolean win = false;
		while (!win) {
			String one=JOptionPane.showInputDialog("Player 1, enter 2 numbers");
			board[one.charAt(0) - 1][one.charAt(1) - 1]=1;
			String two=JOptionPane.showInputDialog("Player 2, enter 2 numbers");
			board[one.charAt(0) - 1][one.charAt(1) - 1]=2;
			win = checkWin();
		}
	}
	
	public static boolean checkWin() {
		return true;
	}
	
	public static int howManyCollatzIterations(int n) {
		int times = 0;
		while(n != 1) {
			n = collatz(n);
			times++;
		}
		return times;
	}
	
	public static int collatz(int n) {
		if (n % 2 == 1)
			return 3 * n + 1;
		return n / 2;
	}
	
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		//String s = input.nextLine();
		//input.close();
		//System.out.println(readNum(s));
		//System.out.println(sortTime());
		//System.out.println(howManyCollatzIterations(45654));
		//tictactoe();
	}
}
