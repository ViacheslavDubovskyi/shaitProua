package hw8_streamApi;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductService {

    public List<Product> getExpensiveBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public List<Product> getBooksWithDiscount(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.isDiscount())
                .peek(product -> {
                    double discountPrice = product.getPrice() * 0.9;
                    product.setPrice(discountPrice);
                })
                .collect(Collectors.toList());
    }

    public Product getCheapestBook(List<Product> products) {
        Optional<Product> optionalProduct = products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparing(Product::getPrice));
        return optionalProduct.orElseThrow(() -> new NoSuchElementException("Product [category]: Book] not found"));
    }

    public List<Product> getLatestProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreateDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public double getTotalPrice(List<Product> products) {
        int currentYear = LocalDate.now().getYear();
        return products.stream()
                .filter(product -> product.getCreateDate().getYear() == currentYear)
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
