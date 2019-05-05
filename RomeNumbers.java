public class RomeNumbers {
    public static int symbolsAndNumbers(String symbol) {
        int num = 0;
        switch (symbol){
            case "I": num = 1;
                break;
            case "II": num =  2;
                break;
            case "III": num = 3;
                break;
            case "IV": num = 4;
                break;
            case "V": num = 5;
                break;
            case "VI": num = 6;
                break;
            case "VII": num = 7;
                break;
            case "VIII": num = 8;
                break;
            case "IX": num = 9;
                break;
            case "X": num = 10;
                break;
        }
        return num;
    }

    public static String numbersAndSymbol(int number) {
        String romeNumber = null;
        switch (number) {
            case 1: romeNumber = "I";
                break;
            case 2: romeNumber = "II";
                break;
            case 3: romeNumber = "III";
                break;
            case 4: romeNumber = "IV";
                break;
            case 5: romeNumber = "V";
                break;
            case 6: romeNumber = "VI";
                break;
            case 7: romeNumber = "VII";
                break;
            case 8: romeNumber = "VIII";
                break;
            case 9: romeNumber = "IX";
                break;
            case 10: romeNumber = "X";
                break;
            case 11: romeNumber = "XI";
                break;
            case 12: romeNumber = "XII";
                break;
            case 13: romeNumber = "XIII";
                break;
            case 14: romeNumber = "XIV";
                break;
            case 15: romeNumber = "XV";
                break;
            case 16: romeNumber = "XVI";
                break;
            case 17: romeNumber = "XVII";
                break;
            case 18: romeNumber = "XVIII";
                break;
            case 19: romeNumber = "XIX";
                break;
            case 20: romeNumber = "XX";
                break;
        }
        return romeNumber;
    }
}
