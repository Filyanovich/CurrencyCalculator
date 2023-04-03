package run;

import calculate.Converter;
import calculate.Transfer;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Exchange rate: " + "1$= " + Transfer.getDollar() + "p");
        System.out.println("Exchange rate: " + "1p= $" + Transfer.getRuble());
        System.out.print("Please, input string: ");
        Converter.readLine(in.nextLine());



    }
}
