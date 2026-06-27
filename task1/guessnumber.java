import java.util.*;

class guessnumber{
    public static void main(String [] args){

        Random random = new Random();

        int secretenumber =  random.nextInt(101);
        Scanner sc = new Scanner(System.in);

        int iterationcount = 0;
        int attempt = 10;

        System.out.println("\n      --------------- Guess the Number Between 1 and 100 -----------------");
        System.out.println("\t       You have to guess the number within 10 attempts.");
        while(true){
        System.out.print("\n\n\n-- enter the number : ");
        int number = sc.nextInt();

        if(number < secretenumber){
            System.out.println("\n-- Too low! Enter a higher number...");
            
        }
        else if(number > secretenumber){
            System.out.println("\n-- Too high! Enter a lower number...");
            
        }
        else{
            System.out.println("\n\n\n------ ----- ------ ------ ------ ------ ------ ------ ------ ------");
            System.out.println("\n\t\tExcellent! Correct guess!");
    
            System.out.println("\n\tCongratulations! You guessed the number in "+iterationcount+" Guesses. ");
            System.out.println("\n");
            System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------");
            System.out.println("\n");
            break;
            
        }
        iterationcount++;
        System.out.print("------ ------ ------");
        System.out.println("\nAttempt Number: "+iterationcount);
        System.out.println("------ ------ ------ ");

        if(iterationcount == attempt){
             System.out.println("\n\n\n\t\t\t------ X ------ END ------ X ------");
            System.out.println("\n\n\t\t\tAll attempts are completed. Try again!");
            // System.out.println("------ ------ ------ ------ ------ ------");s
             System.out.println("\n");
            System.out.println("\t\t\t------ X ------ END ------ X ------");
            System.out.println("\n");
            break;
        }
           
        }

    }
}