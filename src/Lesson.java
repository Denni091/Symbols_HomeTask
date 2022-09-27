
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
public class Lesson {

    public class Main {
        public static void main(String[] args) {
            String string = "  my string" + " is final       ";
        string = string.trim();
            final String trimString = string.trim();
//        str += "!!!!";
//        String newStr = "my string";
//        System.out.println(str);

            final int length = string.length();
            System.out.println("string.length(): " + string.length());
            System.out.println("string.trim().length(): " + string.trim().length());
            final char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 5) {
                //some char changes...
            }
            System.out.println(chars[i]);
        }

            System.out.println("string.isEmpty(): " + string.isEmpty());
            System.out.println("\"\".isEmpty(): " + "".isEmpty());
            System.out.println("\"   \".isEmpty(): " + "   ".trim().isEmpty());
            final String valueOf = String.valueOf(300);
            final char charAt = string.charAt(8);
            System.out.println("string.charAt(8): " + charAt);
        System.out.println("string.charAt(i): ");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }

            final int concatStringLength = string.trim()
                    .concat(" concat string  ")
                    .trim()
                    .concat(" final!!!")
                    .trim()
                    .length();
            System.out.println("concatStringLength: " + concatStringLength);
            System.out.println("string.equals(trimString): " + string.equals(trimString));
            final String lowerCaseString = string.toLowerCase();
            final String upperCaseString = string.toUpperCase();
            System.out.println("lowerCaseString.equals(upperCaseString): " + lowerCaseString.equals(upperCaseString));
            System.out.println("lowerCaseString.equalsIgnoreCase(upperCaseString): " + lowerCaseString.equalsIgnoreCase(upperCaseString));

            // Java 11 +
        String strip = " \t  ".strip();
        System.out.println(strip.length());
        System.out.println("string.stripLeading(): " + string.stripLeading());
        System.out.println("string.stripTrailing(): " + string.stripTrailing());
        System.out.println("strip.isBlank(): " + strip.isBlank());

        String emptyString = "    ";
        System.out.println("\"    \".isEmpty(): " + emptyString.isEmpty());
        if (emptyString.isEmpty()) {
            System.out.println("Ты прислал строку: " + emptyString);
        }
        System.out.println("\"    \".isBlank(): " + emptyString.isBlank());
        System.out.println(string.repeat(3));
        String lines = "line1\n" +
                       "line2\n" +
                       "line3";
        final Stream<String> linesStream = lines.lines();

            //RegEx
            final boolean matches = "Hilleli".matches("(^)H(.*)(i$)");
            System.out.println("Is string matches: " + matches);

            String fewWords = "One two three";
            final String[] words = fewWords.split(" ");
            for (String word : words) {
                System.out.println(word);
            }

            System.out.println("fewWords.replaceAll(\"e\", \"E\"): " + fewWords.replaceAll("e", "EEE"));

            //String.format:
            int random = new Random().nextInt();
            final String format = String.format("string from lesson: %s, with random numeric: %d", string, random);
            System.out.println(format);

            //Pattern for RegEx:
            final Pattern pattern = Pattern.compile("^e", Pattern.CASE_INSENSITIVE);
            final Matcher matcher = pattern.matcher("Example");
            final boolean match = matcher.matches();
            final boolean find = matcher.find();
            System.out.println("match: " + match);
            System.out.println("find: " + find);
        }
    }
}
