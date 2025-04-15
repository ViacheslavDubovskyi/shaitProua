package hw11_parcer;

import java.io.File;
import java.util.*;

public class BookService {

    public File getBook(String bookName) {
        File file = new File("src/hw11_parcer/" + bookName + ".txt");
        if (!file.exists()) {
            System.out.println("Book does not exist");
        }
        return file;
    }

    public Map<String, Integer> countWords(String text) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = wordsSplitter(text);

        for (String word : words) {
            if (word.length() > 2) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else map.put(word, 1);
            }
        }
        return map;

    }

    public int countUniqueWords(String text) {
        Set<String> set = new HashSet<>();
        String[] words = wordsSplitter(text);

        int uniqueWords = 0;
        for (String word : words) {
            if (set.add(word)) {
                uniqueWords++;
            }
        }
        return uniqueWords;
    }

    private String[] wordsSplitter(String text) {
        return text.toLowerCase().split(("[^\\p{L}]+"));
    }
}
