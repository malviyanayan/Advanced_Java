package models;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validator {
    public static boolean isValidEmail(String email){
        String emailRegex = "((?!\\.)[\\w-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])";
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public static boolean isValidPassword(String password){
        String passwordRegex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\\W)(?!.* ).{8,16}";
        Pattern p = Pattern.compile(passwordRegex);
        Matcher m = p.matcher(password);
        return m.matches();
    }

    public static boolean isValidName(String name){
        String nameRegex = "[A-Za-z\\s\\-.']+";
        Pattern p = Pattern.compile(nameRegex);
        Matcher m = p.matcher(name);
        return m.matches();
    }
}
