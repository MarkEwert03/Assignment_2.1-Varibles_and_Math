//Mark Ewert
//Sept 30, 2020

public class D6{
    public static void main(String args[]){
        for (int i = 0; i < 10; i++){
            int currentRoll = (int)(Math.random()*6+1);
            System.out.println("Roll " + (i+1) + ": " + currentRoll);
        }
    }
}