import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageN{
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        //Easy examples to use
        //Example Principal: 100000
        //Example Annual Interest Rate: 3.92
        //Example Period (Years): 30



        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 & years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);


        // \/ \/ \/ Official code that Mosh uses, the ending is not complete because it isn't visible
        // String mortgageFormatted = NumberFormat.getCurrencyInstance().for____;

        // Turns out Mosh's mortgage formatted wasn't needed, I just need to print mortgage and cut down the unneeded numbers after the decimal point
        System.out.println(" ");
        // Converting doubles to ints and ints to doubles
        double zoinks = mortgage*100;
        int ruhroh = (int)zoinks;
        double jinkies = (double)ruhroh;

        // Acutal answer \/ \/ \/
        double mortgagefinal = jinkies*.01;
        System.out.println("Mortgage: " + mortgagefinal);

    }
}