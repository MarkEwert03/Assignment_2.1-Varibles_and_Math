//Mark Ewert
//Sept 30

import java.util.Scanner;

public class DistFormula{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("This function will determine the shortest distance between two point: (x₁,y₁) and (x₂,y₂)");
        System.out.println("");
        System.out.println("Please input the value for x₁");
        double x1 = sc.nextDouble();
        System.out.println("Please input the value for y₁");
        double y1 = sc.nextDouble();
        System.out.println("Please input the value for x₂");
        double x2 = sc.nextDouble();
        System.out.println("Please input the value for y₂");
        double y2 = sc.nextDouble();
        double deltaX = Math.abs(x2 - x1);
        double deltaY = Math.abs(y2 - y1);
        double dist = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("The distance between those points is " + dist);
    }

}