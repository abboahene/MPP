package CourseOverview.Regex;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Q2_License_Plate {

    private static final String STOP    = "STOP";
    private static final String VALID   = "Valid License Plate No.";
    private static final String INVALID = "Not a valid License Plate No.";

    private static final String VALID_IDENTIFIER_PATTERN
            = "[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{3}";


    public static void main (String[] args) {

        String   str, reply;

        while (true) {

            str = JOptionPane.showInputDialog(null, "License Plate:");

            if (str.equals(STOP)) break;


            if (str.matches(VALID_IDENTIFIER_PATTERN)) {
                reply = VALID;

            } else {
                reply = INVALID;
            }

            JOptionPane.showMessageDialog(null, str + ":\n" + reply);
        }
    }

}
