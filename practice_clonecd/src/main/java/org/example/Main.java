package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert 4 elements:");
        int Max = 0;
        for (int i = 0; i < 4; i++) {
            int elem = input.nextInt();
            Max = (i == 0) ? (elem) : (Math.max(Max, elem));
        }
        System.out.println("Max element is " + Max);
    }
}