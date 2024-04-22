package CourseOverview.Regex;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3_License_Plate_Replace8 {

    private static final String STOP    = "STOP";

    public static void main (String[] args) {

        String   str;

        while (true) {
            str = JOptionPane.showInputDialog(null, "Sentence:");

            if (str.equals(STOP)) break;

            JOptionPane.showMessageDialog(null, Level3AB_MyRegExFunctions.myReplaceAll("8",str, "eight" ) + ":\n");
        }
    }

}
