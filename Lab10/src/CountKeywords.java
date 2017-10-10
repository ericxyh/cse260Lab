import java.util.Arrays;
import java.util.TreeSet;
import java.io.*;
public class CountKeywords {
	
	private static final String[] key = new String[] {"abstract","continue", "for",
			"new",	"switch", "assert",	"default",	"goto",	"package",	"synchronized",
			"boolean",	"do",	"if",	"private",	"this",
			"break",	"double",	"implements",	"protected",	"throw",
			"byte",	"else",	"import",	"public",	"throws",
			"case",	"enum",	"instanceof",	"return",	"transient",
			"catch",	"extends",	"int", "short",	"try",
			"char",	"final",	"interface",	"static",	"void",
			"class",	"finally",	"long",	"strictfp", "volatile",
			"const",	"float",	"native",	"super",	"while"};
	private static final TreeSet<String> keyset = new TreeSet<>(Arrays.asList(key));
	
	public static void main(String[] args) throws IOException {
		if (args.length > 0) {
			File file = new File(args[0]);
			FileReader read = new FileReader(file);
			BufferedReader reader = new BufferedReader(read);
			int keyCount = 0;
			boolean longComment = false;
			String temp = reader.readLine();
			while (temp != null) {
				temp = reader.readLine();
				if (temp.contains("//*")) {
					longComment = true;
				}
				if (temp.contains("*//")) {
					longComment = false;
				}
				if (longComment) {
					for (String string : keyset) {
						while (temp.contains(string)) {
							int tempLoc = temp.indexOf(string);
							if (temp.contains("////") && temp.indexOf("////") < tempLoc)
								break;
							else
								keyCount++;
							temp = temp.substring(tempLoc+string.length());
						}
					}
				}
			}
			reader.close();
			System.out.println(keyCount);
		}
	}
	
	
}
