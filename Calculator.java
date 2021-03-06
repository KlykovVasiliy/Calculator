import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calculator {
    private static char signExpression;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String expression = reader.readLine().trim();

            //Создание подстрок
        signExpression = expression.substring(expression.indexOf(' '), expression.lastIndexOf(' ')).trim().charAt(0);
        String subStr1 = expression.substring(0, expression.indexOf(' ')).trim();
        String subStr2 = expression.substring(expression.lastIndexOf(' ')).trim();
        System.out.println(romeOrArabic(subStr1, subStr2));
    }

    //Арифметические вычисления арабскими числами
    public static String arabicNumbers(String num1, String num2) throws IOException {
        String result = null;
        int tempNumbers1 = 0;
        int tempNumbers2 = 0;
        try{
            tempNumbers1 = Integer.parseInt(num1);
            tempNumbers2 = Integer.parseInt(num2);
        }
        catch(Exception e) {
            System.err.println("Ошибка. Введены не два арабских числа.");
        }
        try {
            if ((tempNumbers1 < 1 || tempNumbers1 > 10) || (tempNumbers2 < 1 || tempNumbers2 > 10)) {
                throw new IOException("Введите целое число от 1 до 10");
            }
        } catch(Exception e) {
            System.out.println("Введите два арабских или два римских числа больше 1 и меньше 10");
        }
        if ((tempNumbers1 >= 1 && tempNumbers1 <= 10) && (tempNumbers2 >= 1 && tempNumbers2 <= 10)) {
            result = String.valueOf(arithmeticCalculations(tempNumbers1, tempNumbers2));
        }
        return result;
    }

    //Арифметические вычисления римскими числами
    public static String romeNumbers(String num1, String num2) throws IOException {
        String result = null;
        int tempNumbers1 = 0;
        int tempNumbers2 = 0;
        tempNumbers1 = RomeNumbers.symbolsAndNumbers(num1);
        tempNumbers2 = RomeNumbers.symbolsAndNumbers(num2);
        result = RomeNumbers.numbersAndSymbol(arithmeticCalculations(tempNumbers1, tempNumbers2));
        return result;
    }

    //Определение вычисления арифметических или арабских чисел
    public static String romeOrArabic(String str1, String str2) throws IOException {
        String result = null;
        String rome = "IIIVIIIX";
        String arabic = "12345678910";
        if(rome.contains(str1) && (rome.contains(str2))) {
            result = romeNumbers(str1, str2);
        } else if(arabic.contains(str1) && (arabic.contains(str2))) {
            result = arabicNumbers(str1, str2);
        } else result = arabicNumbers(str1, str2);
        try{
            if(result.equals("null")) {
                result = "";
            }
        } catch (NullPointerException e) {
            System.out.println("В результате ввода вместе арабских и римских цифр или других значений, результат" +
                               " вычисления программы обнуляется");
        }
        return result;
    }

    //Арифметическое вычисление
    public static int arithmeticCalculations (int num1, int num2) throws IOException {
        int result = 0;
        switch(signExpression) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 * num2;
                break;
            default: System.err.println("Ошибка. Арифметическая операция не предусмотрена.");
                break;
        }
        return result;
    }
}
