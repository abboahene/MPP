package CourseOverview.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Level3AB_MyRegExFunctions {

    public static boolean myMatches(String str1, String str2){
        Pattern p = Pattern.compile(str1);
        Matcher m = p.matcher(str2);
        return m.matches();
    }
    public static String myReplaceAll(String regex, String str, String replacement){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return m.replaceAll(replacement);
    }
}
