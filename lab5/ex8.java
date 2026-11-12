package lab5;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex8{

    static class SumTask implements Runnable {

        private int n;

        public SumTask(int n) {
            this.n = n;
        }

        @Override
        public void run() {

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Sum from 1 to " + n + " = " + sum);
        }
    }

    static class PrimeTask implements Runnable {

        @Override
        public void run() {

            StringBuilder primes = new StringBuilder();

            for (int i = 2; i <= 100; i++) {

                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {

                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primes.append(i).append(" ");
                }
            }

            System.out.println("Prime numbers from 1 to 100:");
            System.out.println(primes);
        }
    }

    static class Student {

        private String name;
        private String id;
        private int age;
        private String gender;

        public Student(String name, String id, int age, String gender) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.gender = gender;
        }

        public void display() {
            System.out.println(name + " | " + id + " | " + age + " | " + gender);
        }
    }

    static class CSVTask implements Runnable {

        @Override
        public void run() {

            ArrayList<Student> students = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(
                    new FileReader("students.csv"))) {

                String line;

                br.readLine();

                while ((line = br.readLine()) != null) {

                    String[] data = line.split(",");

                    if (data.length == 4) {

                        Student student = new Student(
                            data[0].trim(),
                            data[1].trim(),
                            Integer.parseInt(data[2].trim()),
                            data[3].trim()
                        );

                        students.add(student);
                    }
                }

                System.out.println("\n===== STUDENT LIST =====");

                for (Student s : students) {
                    s.display();
                }

                System.out.println("Total students: " + students.size());

            } catch (IOException e) {
                System.out.println("Error reading CSV: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        Runnable task1 = new SumTask(n);
        Runnable task2 = new PrimeTask();
        Runnable task3 = new CSVTask();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
            Thread.currentThread().interrupt();
        }

        System.out.println("\nAll tasks finished!");

        input.close();
    }
}
