package lesson10;

public class Product {
    public int idProduct;
    public String product;
    public String dateManufacture;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", product='" + product + '\'' +
                ", dateManufacture='" + dateManufacture + '\'' +
                '}';
    }

}
