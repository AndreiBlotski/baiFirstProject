package lesson10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


import static lesson10.SelectionOrder.*;
import static lesson10.SelectionProduct.*;


public class Menu {

   public static void menu() throws IOException {
        System.out.println("---------------- Добро пожаловать ----------------");
        System.out.println("Выберите номер меню для начала работы");
        System.out.println(" 1. - Список товаров \n 2. - Добавить товар \n 3. - Удалить товар \n 4. - Список заказов \n 5. - Добавить заказ \n 6. - Удалить заказ \n 7. - Выйти");


        ArrayList<Product> arrayProduct = new ArrayList();

        File file = new File("resources/listProduct.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(arrayProduct.toString().getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
        ArrayList<Order> arrayOrder = new ArrayList<>();
        File file1 = new File("resources/listOrder.txt");
        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        fileOutputStream1.write(arrayOrder.toString().getBytes(StandardCharsets.UTF_8));
        fileOutputStream1.close();


        while (true) {
            int choose = menuSelection();
            switch (choose) {
                case 1:
                    showProduct(arrayProduct);
                    break;

                case 2:
                    addProduct(arrayProduct);
                    break;

                case 3:
                    deleteProduct(arrayProduct);
                    break;

                case 4:
                    showOrder(arrayOrder);
                    break;
                case 5:
                    addOrder(arrayOrder);
                    break;

                case 6:
                    deleteOrder(arrayOrder);
                    break;

                case 7:
                    return;

                default:
                    System.out.println("«Нет такой функции»");
                    break;
            }

        }

    }
}

