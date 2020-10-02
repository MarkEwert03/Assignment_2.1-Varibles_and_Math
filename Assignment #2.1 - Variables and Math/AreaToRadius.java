//Mark Ewert
//Sept 30, 2020

import java.util.Scanner;

public class AreaToRadius{

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input the area of a circle:");
    double area = sc.nextDouble();
    double radius = Math.sqrt(area/Math.PI);
    System.out.println("The radius for a circle with an area of " + area + " is " + radius);
}

}