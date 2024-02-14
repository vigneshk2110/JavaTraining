import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Identifiers {

    public static void main(String[] args) {
        String code = "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        int a = 10;\n" +
                "        String b = \"Hello, world!\";\n" +
                "        System.out.println(a + b);\n" +
                "    }\n" +
                "}\n";

        // Create a pattern to match all identifiers
        Pattern pattern = Pattern.compile("[a-zA-Z_$][a-zA-Z0-9_$]*");

        // Create a matcher to match the pattern against the code
        Matcher matcher = pattern.matcher(code);

        // Iterate over the matches and print them out
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}