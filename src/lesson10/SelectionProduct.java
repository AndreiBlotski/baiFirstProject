package lesson10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class SelectionProduct {

    public static int menuSelection() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void addProduct(ArrayList<Product> arrayProduct) {
        System.out.println("Меню добавления  товара");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите идентификатор товара");
        int ID = sc.nextInt();
        System.out.println("Введите название товара");
        String name = sc.next();
        System.out.println("Введите дату изготовления в формате dd-MM-yyyy");
        String strDate = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(strDate, formatter);
        Product product = new Product();
        product.idProduct = ID;
        product.product = name;
        product.dateManufacture = String.valueOf(date);
        arrayProduct.add(product);
        System.out.println("Товар добавлен");


    }

    public static void deleteProduct(ArrayList<Product> arrayProduct) {
        System.out.println("Меню удаления  товара");
        System.out.println("Введите номер товара, который необходимо удалить");
        Scanner sc = new Scanner(System.in);

        int ID = sc.nextInt();
        for (int i = 0; i < arrayProduct.size(); i++) {
            Product product = arrayProduct.get(i);
            if (product.idProduct == ID) {
                arrayProduct.remove(i);
                System.out.println("«Успешно удалено»");
                return;
            }
        }
    }

    public static void showProduct(ArrayList<Product> arrayProduct) {
        System.out.println();
        System.out.println("---------------- Список товаров ----------------");
        System.out.println("идентификатор товара, название товара, дата изготовления товара");
        for (int i = 0; i < arrayProduct.size(); i++) {
            Product product = arrayProduct.get(i);
            System.out.println(product.idProduct + "  " + product.product + "  " + product.dateManufacture);
        }
    }


}
