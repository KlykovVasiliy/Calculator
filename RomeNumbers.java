/**
 * Created by Василий on 01.05.2019.
 */
public class RomeNumbers {
    public static int symbolsAndNumbers(String symbol) {
        int num = 0;
        if(symbol.equals("I")) {
            num = 1;
        } else if(symbol.equals("II")) {
            num = 2;
        } else if(symbol.equals("III")) {
            num = 3;
        } else if(symbol.equals("IV")) {
            num = 4;
        } else if(symbol.equals("V")) {
            num = 5;
        } else if(symbol.equals("VI")) {
            num = 6;
        } else if(symbol.equals("VII")) {
            num = 7;
        } else if(symbol.equals("VIII")) {
            num = 8;
        } else if(symbol.equals("IX")) {
            num = 9;
        } else if(symbol.equals("X")) {
            num = 10;
        }
        return num;
    }

    public static String numbersAndSymbol(int number) {
        String romeNumber = null;
        if(number == 1) {
            romeNumber = "I";
        } else if(number == 2) {
            romeNumber = "II";
        } else if(number == 3) {
            romeNumber = "III";
        } else if(number == 4) {
            romeNumber = "IV";
        } else if(number == 5) {
            romeNumber = "V";
        } else if(number == 6) {
            romeNumber = "VI";
        } else if(number == 7) {
            romeNumber = "VII";
        } else if(number == 8) {
            romeNumber = "VIII";
        } else if(number == 9) {
            romeNumber = "IX";
        } else if(number == 10) {
            romeNumber = "X";
        } else if(number == 11) {
            romeNumber = "XI";
        } else if(number == 12) {
            romeNumber = "XII";
        } else if(number == 13) {
            romeNumber = "XIII";
        } else if(number == 14) {
            romeNumber = "XIV";
        } else if(number == 15) {
            romeNumber = "XV";
        } else if(number == 16) {
            romeNumber = "XVI";
        } else if(number == 17) {
            romeNumber = "XVII";
        } else if(number == 18) {
            romeNumber = "XVIII";
        } else if(number == 19) {
            romeNumber = "XIX";
        } else if(number == 20) {
            romeNumber = "XX";
        }
        return romeNumber;
    }
}
