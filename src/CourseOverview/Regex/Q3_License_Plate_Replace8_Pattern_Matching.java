package CourseOverview.Regex;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3_License_Plate_Replace8_Pattern_Matching {

    private static final String STOP    = "STOP";

    public static void main (String[] args) {

        String   str;

        while (true) {
            str = JOptionPane.showInputDialog(null, "Sentence:");

            if (str.equals(STOP)) break;

            Pattern p = Pattern.compile("8");
            Matcher m = p.matcher(str);
            str = m.replaceAll("eight");

            JOptionPane.showMessageDialog(null,  str+ ":\n");
        }
    }

}
