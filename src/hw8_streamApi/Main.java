package hw8_streamApi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Book", 58.5, true, LocalDate.of(2025, 1, 1)));
        products.add(new Product("Book", 73.1, false, LocalDate.of(2025, 2, 8)));
        products.add(new Product("Lego", 355.8, true, LocalDate.of(2025, 2, 2)));
        products.add(new Product("Book", 230.3, false, LocalDate.of(2024, 10, 5)));
        products.add(new Product("Mouse", 450.0, true, LocalDate.of(2024, 3, 25)));
        products.add(new Product("Book", 290.2, true, LocalDate.of(2023, 7, 16)));

        System.out.println("List of all products: ");
        System.out.println(products);

        ProductService productService = new ProductService();

        //1
        System.out.println("Books with price>250: ");
        List<Product> expensiveBooks = productService.getExpensiveBooks(products);
        System.out.println(expensiveBooks);

        //2
        System.out.println("Books with discount 10%: ");
        List<Product> booksWithDiscount = productService.getBooksWithDiscount(products);
        System.out.println(booksWithDiscount);

        //3
        System.out.println("The cheapest book: ");
        Product cheapestBook = productService.getCheapestBook(products);
        System.out.println(cheapestBook);

        //4
        System.out.println("The latest products: ");
        List<Product> latestProducts = productService.getLatestProducts(products);
        System.out.println(latestProducts);

        //5
        double totalPrice = productService.getTotalPrice(products);
        System.out.println("The total price of books of current year: " + totalPrice);

        //6
        System.out.println("Grouping By Category: ");
        Map<String, List<Product>> groupingByCategory = productService.groupByCategory(products);
        System.out.println(groupingByCategory);

    }
}
