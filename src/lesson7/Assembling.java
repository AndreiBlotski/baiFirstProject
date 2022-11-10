package lesson7;

import static lesson7.FactoryBody.bodyColor;

import static lesson7.FactoryHeads.headColor;

public class Assembling {

    public static String[] robot() {
        String[] headColor = headColor();
        String[] robot = new String[1];
        for (int i = 0; i < 1; i++) {
            robot[i] = headColor[(int) (Math.random() * 3)];
        }
        return robot;
    }

    public static String[] robot1() {
        String[] bodyColor = bodyColor();
        String[] robot1 = new String[1];
        for (int i = 0; i < 1; i++) {
            robot1[i] = bodyColor[(int) (Math.random() * 3)];
        }
        return robot1;
    }

    public static String[] robotName() {
        String[] arrName = new String[]{"Cozmo", "Vetor", "Wall-E", "Eva", "Hare Wolf", "R2-D2", "C-3PO", "Т-800", "Sonny"};
        String[] robotName = new String[1];
        for (int i = 0; i < 1; i++) {
            robotName[i] = arrName[(int) (Math.random() * 10)];
        }
        return robotName;
    }

}



