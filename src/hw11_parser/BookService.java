package hw11_parser;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    public String getContent(File file) {
        if (!file.exists()) {
            System.out.println("Book " + file.getName() + " does not exist");
            System.exit(0);
        }
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Cannot read the file " + file.getName(), e);
        }
        return content.toString();
    }

    public Map<String, Integer> countWords(String text) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.toLowerCase().split(("[^\\p{L}]+"));
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
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (existing, replacement) -> existing,
                        LinkedHashMap::new));
    }

    public int countUniqueWords(String text) {
        return countWords(text).size();
    }
}
