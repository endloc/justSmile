package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();
        Scanner n3 = new Scanner(System.in);
        int num3 = n3.nextInt();
        Scanner n4 = new Scanner(System.in);
        int num4 = n4.nextInt();

        System.out.println("max number: " +
                ((num1>=num2&&num1>=num3&&num1>=num4)?num1:(num2>=num1&&num2>=num3&&num2>=num4)?num2:
                        (num3>=num1&&num3>=num2&&num3>=num4)?num3:(num4>=num1&&num4>=num2&&num4>=num2)?num4:num1));
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