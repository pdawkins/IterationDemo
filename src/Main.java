import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // FOR Statement
        /*
          for ( <initialise> ; <condition> ; <increment> ){
            <body of the loop>
          }
         */



        // FOR Loop
        /*
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
         */



        // FOR Loop - printing multiples of 5
        /*
        for (int i = 1; i <= 100; i++){
            if (i%5 == 0)
                System.out.println(i);
        }

         */

        //fizz buzz on multiples of 3 and 5
        /*
        for (int i = 1; i<= 100; i++){

            if (i%3 == 0 && i%5 == 0)
                System.out.println("Fizz ... Buzz");
            else if (i%3==0)
                System.out.println("Fizz");
            else if (i%5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
        */



        // nested FOR Loop to print pattern
        /*
        for (int i = 1; i <= 10; i++){
            for(int j =1; j<=i; j++)
                System.out.print("*");

            System.out.println();
        }
         */





        // The WHILE Loop
        /*
        while ( <condition> ) {
            <body of the WHILE Loop>
        }
         */

        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");

        int score = input.nextInt();

        // validate the input
        while(score < 0 || score > 100){
            System.out.print("Invalid ... please re-enter: ");
            score = input.nextInt();
        }

        if (score >= 90)
            System.out.println("Grade A");
        else if(score >= 80)
            System.out.println("Grade B");
        else if(score >= 70)
            System.out.println("Grade C");
        else if (score >= 60)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");


         */

        // DO WHILE Loop
        /*
        do {
            <body of the loop>
        } while ( <condition> );
         */

        /*
        Scanner input = new Scanner(System.in);



        // validate the input
        int score;
        do{
            System.out.print("Enter your score: ");
            score = input.nextInt();
        } while(score < 0 || score > 100);

        if (score >= 90)
            System.out.println("Grade A");
        else if(score >= 80)
            System.out.println("Grade B");
        else if(score >= 70)
            System.out.println("Grade C");
        else if (score >= 60)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");

         */
        char option;
        do {
            System.out.println("Select one ... ");
            System.out.println("P] Play Game");
            System.out.println("V] View top Score");
            System.out.println("T] Tutorial");
            System.out.println("Q] Quit");

            Scanner input = new Scanner(System.in);

            option = input.next().charAt(0);

            switch (option) {
                case 'P':
                    System.out.println("Play game");
                    break;
                case 'V':
                    System.out.println("View top score");
                    break;
                case 'T':
                    System.out.println("View Tutorials");
                    break;
                case 'Q':
                    System.out.println("Quit ...");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }
        } while(option != 'Q');



















    }
}