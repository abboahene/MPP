package CourseOverview.Regex;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q4_Exercise_1_Email_Validator {

    private static final String STOP    = "STOP";
    private static final String VALID   = "Valid Email.";
    private static final String INVALID = "Not a valid Email.";

    private static final String VALID_IDENTIFIER_PATTERN
            = "[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]{3}";

    public static void main (String[] args) {

        String   str, reply;
        Matcher matcher;
        Pattern pattern
                = Pattern.compile(VALID_IDENTIFIER_PATTERN);

        while (true) {
            str = JOptionPane.showInputDialog(null, "Email:");

            if (str.equals(STOP)) break;

            matcher = pattern.matcher(str);

            if (matcher.matches()) {
                reply = VALID;

            } else {
                reply = INVALID;
            }

            JOptionPane.showMessageDialog(null, str + ":\n" + reply);
        }
    }

}
