package CourseOverview.Regex;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q4_Exercise_2_IsNumber {

    private static final String STOP    = "STOP";
    private static final String VALID   = "Valid number";
    private static final String INVALID = "Not a number";

    private static final String VALID_IDENTIFIER_PATTERN
            = "[0-9]*";

    public static void main (String[] args) {

        String   str, reply;
        Matcher matcher;
        Pattern pattern
                = Pattern.compile(VALID_IDENTIFIER_PATTERN);

        while (true) {
            str = JOptionPane.showInputDialog(null, "Number:");

            if (str.equals(STOP)) break;

            matcher = pattern.matcher(str);

            if (matcher.matches()) {
                reply = VALID;

            } else {
                reply = INVALID;
            }

            JOptionPane.showMessageDialog(null, str+ ":\n" + reply);
        }
    }


}
