package lesson10;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class SelectionOrder {

    public static void addOrder(ArrayList<Order> arrayOrder) {
        System.out.println("Меню добавления  заказа");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер заказа");
        int ID = sc.nextInt();
        Product product = new Product();
        ArrayList arrayProduct = new ArrayList<>();
        choiceProduct(arrayProduct);
        String listProduct = sc.next();
        Order order = new Order();
        order.idOrder = ID;
        order.order = listProduct;
        arrayOrder.add(order);
        System.out.println("Заказ оформлен");


    }

    private static void choiceProduct(ArrayList<Product> arrayProduct) {
        System.out.println("Меню выбора  товара");
        System.out.println("Введите номер товара, который необходимо выбрать");
        Scanner sc = new Scanner(System.in);

        int ID = sc.nextInt();
        for (int i = 0; i < arrayProduct.size(); i++) {
            Product product = arrayProduct.get(i);
            if (product.idProduct == ID) {
                arrayProduct.get(i);
                System.out.println("«товар успешно добавлен»");
                return;
            }
        }
    }

    public static void deleteOrder(ArrayList<Order> arrayOrder) {
        System.out.println("Меню удаления  заказа");
        System.out.println("Введите номер заказа, который необходимо удалить");
        Scanner sc = new Scanner(System.in);

        int ID = sc.nextInt();
        for (int i = 0; i < arrayOrder.size(); i++) {
            Order order = arrayOrder.get(i);
            if (order.idOrder == ID) {
                arrayOrder.remove(i);
                System.out.println("«Успешно удалено»");
                return;
            }
        }
    }

    public static void showOrder(ArrayList<Order> arrayOrder) {
        System.out.println();
        System.out.println("---------------- Список заказов ----------------");
        System.out.println("идентификатор заказа, список товара, дата оформления заказа");
        for (int i = 0; i < arrayOrder.size(); i++) {
            Order order = arrayOrder.get(i);
            ;
            System.out.println(order.idOrder + "  " + order.order + "  " + new Date());
        }
    }
}