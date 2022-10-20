package lesson4;

import java.util.Scanner;
import static lesson4.Random.randomName;
import static lesson4.Random.randomeAge;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1" );
        int x = 0;
        while (x < 10) {
            int i = ++ x  ;
            System.out.println( i+ " name cat " + randomName() + " age cat " + randomeAge());
        }

        System.out.println();
        System.out.println("задание 2");

        Cat cat = new Cat();
        String [] arrName = new String[]{"","Том","Тимоха","Яшка","Барсик","Котя","Киса","Жора","Мурзик","Кузя","Жура" };
        int [] arrAge = new int [] {0,1,3,5,7,9,11,13,2,4,12};
            for (int j = 1; j < 11; j ++){
                cat.setName(arrName[j]);
                cat.setAge(arrAge[j]);
                System.out.println( j + " " + "name cat " + cat.getName() +" " + "age cat " + cat.getAge());
       }
    }
}