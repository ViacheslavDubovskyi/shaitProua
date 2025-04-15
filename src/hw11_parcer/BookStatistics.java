package hw11_parcer;

import java.util.Map;

public class BookStatistics {

    public void printWords(BookService bookService, String text) {
        Map<String, Integer> map = bookService.countWords(text);
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }

    public void printUniqueWords(BookService bookService, String text) {
        System.out.println("Unique words: " + bookService.countUniqueWords(text));
    }

    public void writeWords(BookService bookService) {
    }

    public void writeUniqueWords(BookService bookService) {
    }
}

