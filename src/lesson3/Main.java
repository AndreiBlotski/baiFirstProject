package lesson3;

import java.util.Scanner;

import static lesson3.raindowhome.*;

public class Main {
    // цвета радуги имеют нумерацию от 1 до 7
    // смешаные цвета получаються при последовательном чередовании цвета радуги как в перед так и назад
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("задайте номер цвета радуги");
        showColor(Scanner);
        showColor1(Scanner);

    }

    private static void showColor(Scanner Scanner) {
        if (Scanner.hasNextInt()) {
            int num = Scanner.nextInt();
            if (num == 1) {
                System.out.println("цвет " + Red);
            }
            if (num == 2) {
                System.out.println("цвет " + Orange);
            }
            if (num == 3) {
                System.out.println("цвет " + Yellow);
            }
            if (num == 4) {
                System.out.println("цвет " + Green);
            }
            if (num == 5) {
                System.out.println("цвет " + Blue);
            }
            if (num == 6) {
                System.out.println("цвет " + Indigo);
            }
            if (num == 7) {
                System.out.println("цвет " + violet);
            }


        }

    }

    private static void showColor1(Scanner Scanner) {
        System.out.println("задайте номер цвета радуги для получения смешаного цвета");
        if (Scanner.hasNextInt()) {
            System.out.println("задайте номер второго цвета радуги");
            int num = Scanner.nextInt();
            if (Scanner.hasNextInt()) {
                int num1 = Scanner.nextInt();
                if (num == 1 && num1 == 2 || num == 2 && num1 == 1) {
                    System.out.print("цвет " + Red + " " + Orange);
                }
                if (num == 1 && num1 == 7 || num == 7 && num1 == 1) {
                    System.out.println(" цвет " + violet + " " + Red);
                }
                if (num == 2 && num1 == 3 || num == 3 && num1 == 2) {
                    System.out.println("цвет " +  Orange + " " + Yellow);
                }
                if (num == 3 && num1 == 4 || num == 4 && num1 == 3) {
                    System.out.println("цвет " + Yellow + " " + Green);
                }
                if (num == 4 && num1 == 5 || num == 5 && num1 == 4) {
                    System.out.println("цвет " + Green + " " + Blue);
                }
                if (num == 5 && num1 == 6 || num == 6 && num1 == 5) {
                    System.out.println("цвет " + Blue + " " + Indigo);
                }
                if (num == 6 && num1 == 7 || num == 7 && num1 == 6) {
                    System.out.println("цвет " + Indigo + " " + violet);
                }

            }
        }
    }
}
