package CourseOverview.Regex;

import javax.swing.*;
import java.util.regex.*;

class Ch9PMCountJava {

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

            javaCount++;
        }

        JOptionPane.showMessageDialog(null,
                "The word 'java' occurred " +
                        javaCount + " times.");
    }
}
