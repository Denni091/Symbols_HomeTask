import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassHelper {

// Сделал валидацию моб.телефона, емейла, дня рождения

    public static void phoneNumberValidate() {

        String phoneNumber = "380931776161";
        Pattern pattern = Pattern.compile("\\d{3}\\d{9}");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()){
            System.out.println("Phone number valid");
        } else {
            System.out.println("Phone number don't valid.Please,try again");
        }
    }

    public static void emailValidate(){

        String emailValidate = "username@gmail.com";
        Pattern pattern = Pattern.compile("^(.+)@(\\S+)$");
        Matcher matcher = pattern.matcher(emailValidate);

        if (matcher.matches()){
            System.out.println("Email valid");
        } else {
            System.out.println("Email don't valid.Please,try again");
        }
    }

    public static void birthdayDayValidate(){

        String birthdayValidate = "06/07/2004";
        Pattern pattern = Pattern.compile("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$");
        Matcher matcher = pattern.matcher(birthdayValidate);

        if (matcher.matches()){
            System.out.println("Birthday valid");
        } else {
            System.out.println("Birthday don't valid.Please,try again");
        }
    }
}
