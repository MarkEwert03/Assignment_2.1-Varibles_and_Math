import java.util.Scanner;

class FunBonus{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you excited for another year of teaching AP Prog this year? :)");
        System.out.println("Please imput your response below (examples are yes, no, and maybe)");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Yay! I'm very excited too, and I'm sure this year will be a blast!!");
        }
        else if (response.equalsIgnoreCase("no")){
            System.out.println("Aw man that's too bad. (Though maybe you just wanted to see what the response for answering 'no' would be)");
        }
        else if (response.equalsIgnoreCase("maybe")){
            System.out.println("Ooh, a mysterious answer. Hopefully we can exceed your expectations and all have a great year!");
        }
        else {
            System.out.println("Unfortunatly I didn't code for every possible response, but it was a typo, then maybe try again.");
        }
    }

}