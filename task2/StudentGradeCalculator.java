import java.util.*;
class StudentGradeCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\t\t\t_____________________________________________________________");

        System.out.println("\n\t\t\t\t       ------ Student Grade System ------");
        System.out.println("\n\t\t\t_____________________________________________________________");
        
        System.out.print("\n\n\n-------------------------\nenter total subjects : ");
        int totalsub = sc.nextInt();
        System.out.println("-------------------------\n");
        int totalmarks = 0;
        System.out.println("________________________________________________________________________________________________________________________");

        System.out.println("\n\n");
        for(int i = 1; i<=totalsub; i++){
            System.out.println("---------------------------");
            System.out.print("enter subject no "+i+" marks : ");
            int marks = sc.nextInt();
            totalmarks+=marks;
        }
        System.out.println("---------------------------");
        System.out.println("\n\n________________________________________________________________________________________________________________________");

        System.out.println("\n\t\t\t\t\t------------ result ------------");
        System.out.println("\n\n\t\t\t\t\t________________________________");
        System.out.println("\n\t\t\t\t\t      | total marks :" + " "+ totalmarks+ "   |");

        double avg = (double) totalmarks / totalsub;

System.out.printf("\n\t\t\t\t\t      | Percentage : %.1f%% |\n", avg);

        if(avg >=90 && avg <= 100){
            System.out.println("\n\t\t\t\t\t      | Grade       : A+" +"    |");
        }
        else if(avg >=80 && avg <= 90){
            System.out.println("\n\t\t\t\t\t      | Grade       : A" +"     |");
        }
         else if(avg >=70 && avg <= 80){
            System.out.println("\n\t\t\t\t\t      | Grade       : B+" +"     |");
        }
         else if(avg >=60 && avg <= 70){
            System.out.println("\n\t\t\t\t\t      | Grade       : B" +"     |");
        }
         else if(avg >=50 && avg <= 60){
            System.out.println("\n\t\t\t\t\t      | Grade       : C+" +"     |");
        }
         else if(avg >=40 && avg <= 50){
            System.out.println("\n\t\t\t\t\t      | Grade       : C" +"     |");
        }
        else{
            System.out.println("fail");
        }

        System.out.println("\n\t\t\t\t\t________________________________");
        System.out.println("\n\n\n");
        
        
    }
}