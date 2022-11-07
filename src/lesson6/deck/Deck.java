package lesson6.deck;

import java.awt.*;
import java.util.Arrays;

import static lesson6.container.Сontainer.*;

public class Deck extends Container {

    public static double[] twoDeckSmall() {
        double[] twoDeck = containerSmall;
        double[] twoDeckSmall = new double[8];
        for (int i = 0; i < twoDeckSmall.length; i++) {
            twoDeckSmall[i] = twoDeck[(int) (Math.random() * 6)];
        }
        System.out.println(Arrays.toString(twoDeckSmall));

        return twoDeckSmall;
    }


    public static double[] twoDeckBig() {
        double[] twoDeck1 = containerBig;
        double[] twoDeckBig = new double[4];
        for (int i = 0; i < twoDeckBig.length; i++) {
            twoDeckBig[i] = twoDeck1[(int) (Math.random() * 6)];
        }
        System.out.println(Arrays.toString(twoDeckBig));
        return twoDeckBig;
    }

    public static double[] singleDeckSmall() {
        double[] singleDeck = containerSmall;
        double[] singleDeckSmall = new double[4];
        for (int i = 0; i < singleDeckSmall.length; i++) {
            singleDeckSmall[i] = singleDeck[(int) (Math.random() * 6)];
        }
        System.out.println(Arrays.toString(singleDeckSmall));
        return singleDeckSmall;
    }

    public static double[] singleDeckBig() {
        double[] singleDeck = containerBig;
        double[] singleDeckBig = new double[2];
        for (int i = 0; i < singleDeckBig.length; i++) {
            singleDeckBig[i] = singleDeck[(int) (Math.random() * 6)];
        }
        System.out.println(Arrays.toString(singleDeckBig));
        return singleDeckBig;
    }
//
//    public static void main(String[] args) {
//        twoDeckSmall();
//        twoDeckBig();
//        singleDeckSmall();
//        singleDeckBig();
//
//    }

}



