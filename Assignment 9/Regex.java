
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Z].*\\.");
        Matcher matcher = pattern.matcher("Visit W3Schools!.");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}