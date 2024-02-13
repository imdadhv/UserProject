package org.example.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUtil {
    public static boolean checkPin(String pin) {
        Pattern pattern = Pattern.compile(".{8}");
        Matcher matcher = pattern.matcher(pin);
        return matcher.matches();
    }
}
