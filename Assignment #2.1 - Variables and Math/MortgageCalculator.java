//Mark Ewert
//Sept 30, 2020

import java.util.Scanner;

public class MortgageCalculator{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will find the final amount of an intrest account using the formula A = P(1+r)ᵗ");
        System.out.println("");
        System.out.println("Please input the principle value (P)");
        double principle = sc.nextDouble();
        System.out.println("Please input the intrest value between 0 and 1 (r)");
        double rate = sc.nextDouble();
        System.out.println("Please input the number of years (t)");
        double years = sc.nextDouble();
        double amount = principle*Math.pow((1+rate), years);
        amount = (Math.round(amount*100.0))/100.0;
        System.out.println("This will yield $" + amount);
    }

}