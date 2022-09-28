import java.util.Arrays;
import java.util.Locale;

public class StringHelper {

    public static void workWithString() {
        String string = "SomeText";
        String array = "I have car  ";

// 1.1 Не уверен правильно или нет,но понял я так,если массив null,то я оповещаю! ->
//     А если не null,делаю вывод charArray
        char[] charArray = array.toCharArray();
        if (charArray == null) {
            System.out.println("Array is null");
        } else {
            System.out.println(charArray);
        }

// 1.2 Обе строки не пустые, поэтому вывод будет пустой
        if (string.isEmpty()) {
            System.out.println("String is not empty");
        } else {
            System.out.println("String is empty");
        }
        if (array.isEmpty()) {
            System.out.println("String array is not empty");
        } else {
            System.out.println("String array is empty");
        }

// 1.3 Привел строку string к Upper Case, array к Lower Case
        final String upperCase = string.toUpperCase();
        final String lowerCase = array.toLowerCase();

// 1.4 Убрал наличие возможных пробелов в строке
        final String trimString = string.trim();
        final String trimArray = array.trim();

        System.out.println("String trim:" + trimString + "\nArray trim:" + trimArray);

// 1.5 Сделал конкатинацию строк разделив пробелом (Только не догадался как разделить две строки ->
//     слиплись сами по себе)
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
        for (int i = 0; i < array.length(); i++) {
            System.out.print(array.charAt(i) + " ");
        }

//1.6 Удалил часть строки и вывел результат
       final String stringSubstring = string.substring(2, 6);
       final String arraySubstring = array.substring(3, 6);
        System.out.println("\nString substring: " + stringSubstring + "\nArray Substring: " + arraySubstring);
    }
}