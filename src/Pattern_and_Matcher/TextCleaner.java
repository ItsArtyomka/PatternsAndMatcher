package Pattern_and_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCleaner {
    public static void main(String[] args) {
        String text = "<strike>Delete this!</strike>This is good text, don't touch this text.<strike>This is not needed either</strike>";

        Pattern pattern = Pattern.compile("<strike>(.*?)</strike>");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("---Found match---\n" + text.substring(start, end) + "\nFrom index " + start + " to " + (end));
        }

        System.out.println("Clean text: " + matcher.replaceAll(""));
    }
}
