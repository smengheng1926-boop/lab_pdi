package lab5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        do{

            System.out.println("\n==========================");
            System.out.println("1. Addition (+) ");
            System.out.println("2. Subtraction (-) ");
            System.out.println("3. Multiplication (*) ");
            System.out.println("4. Division (/) ");
            System.out.println("5. Sum from 1 to n ");
            System.out.println("6. Exit");

            System.out.print("\nChoose an option: ");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter the first number: ");
                    double f = sc.nextDouble();

                    System.out.print("Enter the second number: ");
                    double s = sc.nextDouble();

                    System.out.print("The sum is: " + (f+s) );
                    break;

                case 2:
                    System.out.print("Enter the first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter the secont number: ");
                    double b = sc.nextDouble();

                    System.out.print("The sum is: " + (a-b));
                    break;
                
                case 3:
                    System.out.print("Enter the first numbber: ");
                    double q = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    double w = sc.nextDouble();

                    System.out.print("The sum is: " + (q*w));
                    break;

                case 4:
                    System.out.print("Enter the first number: ");
                    double e = sc.nextDouble();
                    System.out.println("Enter the second number: ");
                    double r = sc.nextDouble();

                    if ( e!= 0 || r != 0){
                        System.out.print("The sum is: " + (e/r));

                    }else{
                        System.out.print("Cannot dividion.");
                    }
                    break;

                case 5:
                    System.out.print("Enter the n: ");
                    int n = sc.nextInt();

                    int sum= 0;

                    for(int i = 1; i<=n; i++){

                        sum += i;
                    }
                    System.out.print("The sum from 1 to n is:  "+ sum);
                    break;    
                    
                case 6:
                    System.out.print("Thank you for using me");
                    break;
                
                default:
                    System.out.print("Invalid choice! Please try again.");
            }
        }while( choice != 6);

        sc.close();
    }
}
