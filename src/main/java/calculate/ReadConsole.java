package calculate;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReadConsole {

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static String toDollars(String dollar) {
        double value = Double.parseDouble(dollar.substring(0, dollar.length()));
        return "$" + round(Transfer.getRubleToDollar(String.valueOf(value)), 2);
    }

    public static String toRubles(String ruble) {
        double value = Double.parseDouble(ruble.substring(0, ruble.length()));
        return round(Transfer.getDollarToRuble(String.valueOf(value)), 2) + "p";
    }

    public static void printResult(String result) {
        System.out.println("Calculation result: " + result);
    }
}
