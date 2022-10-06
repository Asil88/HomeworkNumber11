package task1;

import task1.Document;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Document.contains(scanner.nextLine());
            Document.startsWith(scanner.nextLine());
            Document.endsWith(scanner.nextLine());


        } catch (ExceptionContains | EceptionContainsStart | ExceptionContainsEnds e) {
            System.out.println(e.getMessage());
            e.fillInStackTrace();
        }



    }
}