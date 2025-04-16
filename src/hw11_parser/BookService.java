package hw11_parser;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    public File getBook(String bookName) {
        File file = new File("src/hw11_parser/" + bookName + ".txt");
        if (!file.exists()) {
            System.out.println("Book does not exist");
        }
        return file;
    }

    public String getContent(File file) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException("Cannot read the file " + file.getName(), e);
        }
        return content.toString();

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

    public Map<String, Integer> getTopMap(String text) {
        return countWords(text).entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public int countUniqueWords(String text) {
        return countWords(text).size();
    }

    private String[] wordsSplitter(String text) {
        return text.toLowerCase().split(("[^\\p{L}]+"));
    }
}
