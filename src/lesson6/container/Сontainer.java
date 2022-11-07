package lesson6.container;

import lesson6.port.Port;

public class Сontainer extends Port {
    public static double cylinderSmall1;
    public static double cylinderSmall2;
    public static double cylinderBig1;
    public static double cylinderBig2;
    public static double cubeSmall1;
    public static double cubeSmall2;
    public static double cubeBig1;
    public static double cubeBig2;
    public static double coneSmall1;
    public static double coneSmall2;

    public static double coneBig1;
    public static double coneBig2;

    public static double[] containerSmall = {volumeCylinderSmall1(), volumeCylinderSmall2(), volumeCubeSmall1(), volumeCubeSmall2(), volumeconeSmall1(), volumeconeSmall2()};
    public static double[] containerBig = {volumeCylinderBig1(), volumeCylinderBig2(), volumecubeBig1(), volumecubeBig2(), volumeconeBig1(), volumeconeBig2()};


    private static double volumeCylinderSmall1() {
        cylinderSmall1 = ((3.14 * (5 * 5) * 20) * 1000);
        return cylinderSmall1;
    }

    private static double volumeCylinderSmall2() {
        cylinderSmall2 = ((3.14 * (5 * 5) * 20) * 2000);
        return cylinderSmall2;
    }

    private static double volumeCylinderBig1() {
        cylinderBig1 = ((3.14 * (5 * 5) * 20) * 1000);
        return cylinderBig1;
    }

    private static double volumeCylinderBig2() {
        cylinderBig2 = ((3.14 * (5 * 5) * 20) * 2000);
        return cylinderBig2;
    }

    private static double volumeCubeSmall1() {
        cubeSmall1 = ((10 * 10 * 20) * 1000);
        return cubeSmall1;
    }

    private static double volumeCubeSmall2() {
        cubeSmall2 = ((10 * 10 * 20) * 2000);
        return cubeSmall2;
    }

    private static double volumecubeBig1() {
        cubeBig1 = ((20 * 20 * 40) * 1000);
        return cubeBig1;
    }

    private static double volumecubeBig2() {
        cubeBig2 = ((20 * 20 * 40) * 2000);
        return cubeBig2;
    }

    private static double volumeconeSmall1() {
        coneSmall1 = ((0.33 * 3.14 * (5 * 5) * 20) * 1000);
        return coneSmall1;
    }

    private static double volumeconeSmall2() {
        coneSmall2 = ((0.33 * 3.14 * (5 * 5) * 20) * 2000);
        return coneSmall2;
    }

    private static double volumeconeBig1() {
        coneBig1 = (0.33 * 3.14 * (10 * 10) * 40);
        return coneBig1;
    }

    private static double volumeconeBig2() {
        coneBig2 = (0.33 * 3.14 * (10 * 10) * 40);
        return coneBig2;
    }
}
