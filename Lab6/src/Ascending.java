import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
public class Ascending {
	
	/*
	public static void sort(String[] list) {
		Arrays.sort(list);
	}*/
	
	public static void main(String[] args) {
		ArrayList<String> stuff = new ArrayList<String>();
		try {
			FileReader fileReader = new FileReader(args[0]);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String next = bufferedReader.readLine();
			while (next != null) {
				stuff.add(next);
				next = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File not found.");
		} catch(IOException ex) {
			System.out.println("Error reading file.");
		}
		Collections.sort(stuff);
		for (String string : stuff) {
			if (string.charAt(0) >= 65)
				System.out.println(string);
		}
	}
}
