package IS_ALPHA;

public class IsAlpha {

    public static boolean isAlphabetString(String s)
    {
        if (s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String s = "Rakesh12";
        if (isAlphabetString(s)){
            System.out.println("The Given String contains only alphabets");
        }
        else {
            System.out.println("The given String has other than alphabets also");
        }
    }
}
