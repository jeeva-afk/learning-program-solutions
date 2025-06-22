package ECommerceSearchFunction;

public class Product {
    String name;
    String category;
    String description;
    double price;

    public Product(String name, String category, String description, double price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - ₹" + price;
    }
}
