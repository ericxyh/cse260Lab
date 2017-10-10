import java.util.TreeSet;
import java.io.*;
public class NonduplicateWords {
	
	public static void main(String[] args) throws IOException {
		if (args.length > 0) {
			File file = new File(args[0]);
			FileReader read = new FileReader(file);
			BufferedReader reader = new BufferedReader(read);
			TreeSet<String> set = new TreeSet<>();
			String temp = reader.readLine();
			while (temp != null) {
				set.add(temp);
				temp = reader.readLine();
			}
			reader.close();
			System.out.println(set);
		}
	}
}
