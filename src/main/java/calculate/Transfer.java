package calculate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Transfer {
    public static final String PATH_TO_PROPERTIES = "src/course.properties";

    public static double getDollar() {
        FileInputStream fileInputStream;
        Properties prop = new Properties();
        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String dollarString = prop.getProperty("dollar");
        double dollar = Double.parseDouble(dollarString);
        return dollar;
    }

    public static double getRuble() {
        FileInputStream fileInputStream;
        Properties prop = new Properties();
        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String rubleString = prop.getProperty("ruble");
        double ruble = Double.parseDouble(rubleString);
        return ruble;
    }

    public static double getDollarToRuble(String value) {

        String dollarsString = value.substring(1);
        double dollars = Double.parseDouble(dollarsString);
        double result = dollars * getDollar();

        return result;

    }

    public static double getRubleToDollar(String value) {

        String rublesString = value.substring(0, value.length() - 1);
        double rubles = Double.parseDouble(rublesString);
        double result = rubles * getRuble();

        return result;

    }

}

