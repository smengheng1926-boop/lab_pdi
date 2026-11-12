package lab5;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex10 {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader("students.csv"))) {

            String line;


            br.readLine();

            while ((line = br.readLine()) != null) {
                students.add(line.trim());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("===== STUDENT NAMES A-Z =====");

        students.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
