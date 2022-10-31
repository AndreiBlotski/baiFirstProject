package lesson5;

public class Random {public class RandomCellNum {
    String randomName = randomcell();
    double randomAge = randomcellnum();

    static double randomcellnum1() {
        double max = 2.0;
        double min = 0.0;
        return (double) ((Math.random() * ((max - min) + 0)) + min);

    }
    static  double randomcellnum() {
        double roundOff = Math.round(randomcellnum1() * 100000.0)/100000.0;
        return roundOff;
    }


    static String randomcell() {
        String cell = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            int randomIndex = (int)(Math.random() * cell.length());
            randomString.append(cell.charAt(randomIndex));
        }
        return randomString.toString();

    }
}

}
