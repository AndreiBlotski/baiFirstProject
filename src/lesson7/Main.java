package lesson7;

import java.util.Arrays;

public class Main extends Assembling {
    public static void main(String[] args) {
        int x = 0;
        while (x < 9) {
            int i = ++x;
            System.out.println(i + " " + "Robot name" + Arrays.toString(robotName()) + Arrays.toString(robot()) + Arrays.toString(robot1()));
        }
     }
}
