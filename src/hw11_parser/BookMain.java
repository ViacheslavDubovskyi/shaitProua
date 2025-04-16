package hw11_parser;

import java.io.File;
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        scanner.close();

        BookService bookService = new BookService();
        BookStatistics bookStatistics = new BookStatistics();

        File bookFile = bookService.getBook(bookName);
        String content = bookService.getContent(bookFile);
        bookStatistics.print(bookService, content);

        File infoBook = new File("src/hw11_parser/" + bookName + "_statistics.txt");
        bookStatistics.writeToFile(bookService, infoBook, content);


    }
}
