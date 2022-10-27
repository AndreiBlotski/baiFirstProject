package lesson4;

import static lesson4.Random.randomName;
import static lesson4.Random.randomeAge;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("",0);

        System.out.println("задание 1");
        int x = 0;
        while (x < 10) {
            int i = ++x;
            System.out.println(i + " name cat " + randomName() + " age cat " + randomeAge());
        }

        System.out.println();
        System.out.println("задание 2");

        /* можно использовать переменную цикл создать 10 котов с одноименным именем и возвратом*/
        String [] arrName = new String[]{"","Том","Тимоха","Яшка","Барсик","Котя","Киса","Жора","Мурзик","Кузя","Жура" };
        int [] arrAge = new int [] {0,1,3,5,7,9,11,13,2,4,12};
            for (int j = 1; j < 11; j ++){
                cat.setName(arrName[j]);
                cat.setAge(arrAge[j]);
                System.out.println( j + " " + "name cat " + cat.getName() +" " + "age cat " + cat.getAge());
    }

        System.out.println();
        System.out.println("задание 3");

            Cat cat1 = new Cat(" ",0);
        String [] arrName1 = new String[]{"","Том","Тимоха","Яшка","Барсик","Котя","Киса","Жора","Мурзик","Кузя","Жура" };
        int [] arrAge1 = new int [] {0,1,3,5,7,9,11,13,2,4,12};
        cat1.name(arrName1);
        cat1.age(arrAge1);
            int c = 1;
            do {
                System.out.println(c + " " + "name cat " + arrName1[c] + " " + "age cat " + arrAge1[c]);
                c++;
            }while ( c < 11);

        System.out.println();
        System.out.println("задание 4");

        String [] arrName2 = new String[]{"Киса","Жора","Мурзик","Кузя","Жура"};
        int [] arrAge2 = new int [] {11,13,2,4,12,0,0};
        int idx = 0;
        for (int ignored : arrAge2) {
            ++ idx;
            for ( String ignored1 : arrName2){
            ++ idx;

                      System.out.println(arrAge2[idx] + arrName2[idx]);
            }

        }

    }
}