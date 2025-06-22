package ECommerceSearchFunction;

import java.util.*;

public class SearchEngine {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<String> getSuggestions(String input) {
        List<String> suggestions = new ArrayList<>();
        for (Product p : products) {
            if (p.name.toLowerCase().contains(input.toLowerCase())) {
                suggestions.add(p.name);
            }
        }
        return suggestions;
    }

    public List<Product> search(String input) {
        List<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.name.toLowerCase().contains(input.toLowerCase()) ||
                p.category.toLowerCase().contains(input.toLowerCase()) ||
                p.description.toLowerCase().contains(input.toLowerCase())) {
                results.add(p);
            }
        }
        return results;
    }
}
