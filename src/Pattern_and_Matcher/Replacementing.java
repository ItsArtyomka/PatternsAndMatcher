package Pattern_and_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacementing {
    public static void main(String[] args) {
        String str = "Ivan Petrov";
        System.out.println(str);

        Pattern pattern = Pattern.compile("(.*) (.*)");
        Matcher matcher = pattern.matcher(str);

        // Swapping the words around
        // In this case Ivan Petrov --> Petrov Ivan
        // $2 is "Petrov" and $1 is "Ivan"
        // Replacement of $1 with $2
        System.out.println(matcher.replaceFirst("$2 $1"));

    }
}
