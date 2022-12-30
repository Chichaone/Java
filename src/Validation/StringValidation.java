package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidation {
    // функция для сравнения строк в зависимости от регистра
    public static String vStCompareInsen(String stValOne, String stValTwo) {
        try {
            if (stValOne.equalsIgnoreCase(stValTwo)) {
                System.out.println("\nStrings are equal, case insensitive");
            } else {
                MessagesValidation.vStValid(0);
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            return "false";
        }
        return "true";
    }


    public static String vStCompareSen(String stValOne, String stValTwo) {
        try {

            if (stValOne.equals(stValTwo)) {
                System.out.println("Strings are equal, case sensitive\n");
            } else {
                MessagesValidation.vStValid(1);
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            return "false";
        }
        return "true";
    }

    // функция для приведения строк к одному регистру, удаления пробелов в начале и в конце и дублирование пробелов
    public static String vSpaceDelete(String stValOne, String stValTwo) {
        String resOne = stValOne.toUpperCase();
        String resTwo = stValTwo.toUpperCase();
        String delSpaceOne = resOne.replaceAll("\\s+", " ");
        String delSpaceTwo = resTwo.replaceAll("\\s+", " ");
        System.out.println(delSpaceOne.trim());
        System.out.println(delSpaceTwo.trim() + "\n");
        vStCompareInsen(delSpaceOne, delSpaceTwo);
        return "true";
    }

    // функция для проверки первой строки относительно второй на обратную последовательность
    public static String vStReverse(String stValOne, String stValTwo) {
        try {
            int stringLength = stValTwo.length();
            String result = "";
            for (int i = 0; i < stringLength; i++) {
                result = stValTwo.charAt(i) + result;
            }
            if (result.equals(stValOne)) {
                System.out.println("Strings are equal. Strings are shifters\n");
            } else {
                MessagesValidation.vStValid(2);
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            return "false";
        }
        return "true";
    }

    //проверка являются ли строки E-mail'ом
    public static String vEmail(String stVal) {
        try {

            Pattern pattern = Pattern.compile("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+");
            Matcher matcher = pattern.matcher(stVal);

            if (matcher.find()) {
                System.out.println("Passed the check: " +
                        stVal.substring(matcher.start(), matcher.end()) + " \nIt is an email address\n");
            } else {
                System.out.println("\nFailed the check: " + stVal);
                MessagesValidation.vStValid(3);
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            return "false";
        }
        return "true";
    }

    //проверка являются ли строки номером телефона
    public static String vPhoneNumber(String stVal) {
        try {

            Pattern pattern = Pattern.compile("^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$");
            Matcher matcher = pattern.matcher(stVal);

            if (matcher.find()) {
                System.out.println("Passed the check: " +
                        stVal.substring(matcher.start(), matcher.end()) + " \nIt is a phone number\n");
            } else {
                System.out.println("\nFailed the check: " + stVal);
                MessagesValidation.vStValid(4);

            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            return "false";
        }
        return "true";
    }

    //проверка являются ли строки ip-адресом
    public static String vIpAddress(String stVal) {
        try {

            Pattern pattern = Pattern.compile("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}");
            Matcher matcher = pattern.matcher(stVal);

            if (matcher.find()) {
                System.out.println("Passed the check:  " +
                        stVal.substring(matcher.start(), matcher.end()) + " \nIt is an ip address(ipv4)\n");
            } else {
                System.out.println("\nFailed the check: " + stVal);
                MessagesValidation.vStValid(5);
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            return "false";
        }
        return "true";
    }

    public static String sDate(String stVal) {
        try {

            Pattern pattern = Pattern.compile("(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})");
            Matcher matcher = pattern.matcher(stVal);

            if (matcher.find()) {
                return stVal;
            } else {
                System.out.println("\nFailed the check: " + stVal);
                MessagesValidation.vStValid(11);

            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            return "false";
        }
        return "true";
    }
}