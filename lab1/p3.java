package lab1;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int[] numbers = new int[5];

       System.out.print("Enter 5 numbers : ");
       for(int i=0; i<numbers.length; i++){
        numbers[i] = input.nextInt();
       }

       //2. Assume the first number is both the min and the max

       int min = numbers[0];
       int max = numbers[0];

        // 3. Compare every other number against the current min and max

        for(int i=1; i<numbers.length; i++){
            if(numbers[i]< min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        // 4. Print the result
        System.out.println("\n\nOut put");
        System.out.print("Amoung all the five numbers (");

        for(int i=0; i<numbers.length; i++){
            System.out.print("\n " + numbers[i]);
           if(i< numbers.length-1){
            System.out.print(", ");
           }

        }
        System.out.println("), min is " + min + " and max is " + max + ".");

        

        input.close();

    }
}
