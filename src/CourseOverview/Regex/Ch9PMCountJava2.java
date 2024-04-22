package CourseOverview.Regex;

import javax.swing.*;
import java.util.regex.*;

class Ch9PMCountJava2 {

    public static void main (String[] args) {

        String   document;
        int      javaCount;

        Matcher  matcher;
        Pattern  pattern = Pattern.compile("java",
                Pattern.CASE_INSENSITIVE);

        document  = JOptionPane.showInputDialog(null, "Sentence:");

        javaCount = 0;


        matcher   = pattern.matcher(document);

        while (matcher.find()) {

            System.out.println(document.substring(matcher.start(),
                    matcher.end())
                    + " found at position "
                    + matcher.start());
        }

    }
}

