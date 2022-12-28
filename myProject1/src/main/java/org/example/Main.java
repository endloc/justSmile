package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int numbers[] = new int[size];
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        java.util.Arrays.sort(numbers);
        System.out.println("Max element is " + numbers[size - 1]);
    }
}

//public class Main {
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    String n1 = reader.readLine();
//    int num1 = Integer.parseInt(n1);
//    public static void main(String[] args) {
//        System.out.print("max number: " + num1);
//    }
//}