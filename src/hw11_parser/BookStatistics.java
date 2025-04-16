package hw11_parser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class BookStatistics {

    public void print(BookService bookService, String text) {
        bookService.getTopMap(text)
                .forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("Unique words: " + bookService.countUniqueWords(text));
    }

    public void writeToFile(BookService bookService, File file, String text) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (Map.Entry<String, Integer> entry : bookService.getTopMap(text).entrySet()) {
                writer.println(entry.getKey() + " : " + entry.getValue());
            }
            writer.println("Total unique words:" + bookService.countUniqueWords(text));
        } catch (IOException e) {
            throw new RuntimeException("Cannot write into the file", e);
        }
    }
}

