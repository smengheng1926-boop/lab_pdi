package lab1;

import java.util.Scanner;

public class p2 {
    public static void findroot(int a, int b, int c){

        float delta = b*b - 4*a*c;

        if( a == 0){
            double root = (-c/(double)b);
            System.out.println("The equation is not a quadratic fomula. but root is = " + root);

        }else {

            if( delta > 0 ){
                double root1 = (double) (-b+Math.sqrt(delta));
                double root2 = (double) ( b - Math.sqrt(delta));

                System.out.println(" The root of x1 = " + root1);
                System.out.println(" The root of x2 = " + root2);
            }
            if( delta == 0){
                double r = (-b/2*a);
                System.out.println("This roots of equation is x = " + r);
            }
            if( delta <0){
                System.out.println(" The roots of this equation is not real ");
            }
        }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("=================================================");
        System.out.println("             Welcome to our program          ");
        System.out.println("\'Quadratic Equation Solver ax^2 + bx + c = 0\'");
        System.out.println("=================================================");

        System.out.print("\n Input a : ");
        a = sc.nextInt();
        System.out.print("Input b: ");
        b = sc.nextInt();
        System.out.print("Input c: ");
        c = sc.nextInt();

        findroot(a, b, c);

        sc.close();

    }
}