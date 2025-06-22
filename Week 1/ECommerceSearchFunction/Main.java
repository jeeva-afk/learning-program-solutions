package ECommerceSearchFunction;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SearchEngine engine = new SearchEngine();
        engine.addProduct(new Product("Blue Running Shoes", "Footwear", "Comfortable shoes for running", 1299));
        engine.addProduct(new Product("Adidas Sports Shoes", "Footwear", "High-quality sportswear", 2499));
        engine.addProduct(new Product("Red T-Shirt", "Apparel", "Cotton casual t-shirt", 599));
        engine.addProduct(new Product("Blue Jeans", "Apparel", "Slim-fit jeans for men", 1199));

        Scanner sc = new Scanner(System.in);
        System.out.print("Search (type something): ");
        String input = sc.nextLine();

        List<String> suggestions = engine.getSuggestions(input);
        System.out.println("Autocomplete Suggestions:");
        for (String s : suggestions) {
            System.out.println("  → " + s);
        }

        List<Product> results = engine.search(input);
        System.out.println("\nSearch Results:");
        for (Product p : results) {
            System.out.println("  - " + p);
        }
    }
}
