package org.example;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidation {

        private static final String emailIdRegex = "(^[a-z A-Z 0-9]+([-.+_]?[a-zA-Z0-9]+)*\\@[A-Z a-z 0-9]+\\.[a-z A-z]{2,})$";

        public static boolean validateEmailId(String emailId){
            return Pattern.matches(emailIdRegex,emailId);
        }

}
