package lesson4;

public class Random {
        String randomName = randomName();
        Integer randomAge = randomeAge();

    static Integer randomeAge() {
        int max = 28;
        int min = 1;
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    static String randomName() {
        String nameCat = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder randomString = new StringBuilder();
                for (int i = 0; i < 7; i++) {
                        int randomIndex = (int)(Math.random() * nameCat.length());
                        randomString.append(nameCat.charAt(randomIndex));
        }
        return randomString.toString();

    }
}

