package lesson10;

public class Order {
    public int idOrder;

    public String order;

    public String dateOrder;

    public Order() {

    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", order='" + order + '\'' +
                ", dateOrder='" + dateOrder + '\'' +
                '}';
    }
}
