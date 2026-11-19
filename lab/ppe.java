package lab;

import java.util.Scanner;

public class ppe {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;

        for(int k = 1000; k>=n; k--){

            System.out.println(k);

            sum += k;
        }

        double a =(double) sum/(1000-n+1);

        System.out.print("\nSum: " + sum);
        System.out.print("\nAverage = " + a);

        input.close();
    }
    
}
