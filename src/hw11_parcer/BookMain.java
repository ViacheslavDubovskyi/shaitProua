package hw11_parcer;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        BookService bookService = new BookService();
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        BookStatistics bookStatistics = new BookStatistics();

        String text = "To Sherlock Holmes she is always the woman. I have seldom heard him mention her under any other name.\n" +
                "In his eyes she eclipses and predominates the whole of her sex. It was not that he felt any emotion akin to love for\n" +
                "Irene Adler. All emotions, and that one particularly, were abhorrent to his cold, precise but admirably balanced mind.\n" +
                "He was, I take it, the most perfect reasoning and observing machine that the world has seen, but as a lover he would\n" +
                "have placed himself in a false position. He never spoke of the softer passions, save with a gibe and a sneer.\n" +
                "They were admirable things for the observer—excellent for drawing the veil from men’s motives and actions.\n" +
                "But for the trained reasoner to admit such intrusions into his own delicate and finely adjusted temperament\n" +
                "was to introduce a distracting factor which might throw a doubt upon all his mental results. Grit in a sensitive\n" +
                "instrument, or a crack in one of his own high-power lenses, would not be more disturbing than a strong emotion\n" +
                "in a nature such as his. And yet there was but one woman to him, and that woman was the late Irene Adler,\n" +
                "of dubious and questionable memory.";

        bookStatistics.printWords(bookService, text);
        bookStatistics.printUniqueWords(bookService, text);

        scanner.close();


    }
}
