package lesson7;

import java.util.Arrays;

import static lesson7.PartsBody.HEAD;

public class FactoryHeads extends Assembling {
    public static PartsBody head = HEAD;

    public FactoryHeads() {
        headColor();

    }

    public static String[] headColor() {
        String[] headColor = new String[]{"Red", "Green", "Blue"};
        for (int i = 0; i < headColor.length; i++) {
            headColor[i] = (head.getPart() + headColor[i]);

        }
        return headColor;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(headColor()));
    }


}
