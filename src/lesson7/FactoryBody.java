package lesson7;

import java.util.Arrays;

import static lesson7.PartsBody.BODY;

public class FactoryBody extends Assembling {
    public static PartsBody body = BODY;

    public static String[] bodyColor() {
        String[] bodyColor = new String[]{"Orange", "Indigo", "Violet"};
        for (int i = 0; i < bodyColor.length; i++) {
            bodyColor[i] = (body.getPart() + bodyColor[i]);

        }
        return bodyColor;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bodyColor()));
    }

}
