package lab5;


import java.math.BigInteger;

public class ex5 {

  
    public static BigInteger factorialLoop(int n) {

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

   
    public static BigInteger factorialRecursive(int n) {

        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(n)
                .multiply(factorialRecursive(n - 1));
    }

   
    public static void main(String[] args) {

        int[] numbers = {3, 6, 10, 50};

        System.out.println("===== FACTORIAL COMPARISON =====");

        for (int n : numbers) {

            System.out.println("\nNumber: " + n);

            System.out.println("Procedural: "
                    + factorialLoop(n));

            System.out.println("Recursive: "
                    + factorialRecursive(n));
        }
    }
}
