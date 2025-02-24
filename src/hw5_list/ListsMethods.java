package hw5_list;

import java.util.*;

public class ListsMethods {

    public static void main(String[] args) {

        List<String> demoCount = List.of("apple", "cat", "cat", "dog", "fox", "fox", "fox", "nut", "nut");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String userWord = sc.nextLine();
        System.out.println("Occurrence of the word " + userWord + " is " + countOccurance(demoCount, userWord));


        String[] stringArray = {"apple", "cat", "dog", "fox", "nut"};
        List<String> demoToList = new ArrayList<>(toList(stringArray));
        System.out.println("Array as List: " + demoToList);

        List<Integer> demoUnique = List.of(1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 10, 10);
        System.out.println("Unique List: " + findUnique(demoUnique));

        calcOccurance(demoCount);
        findOccurance(demoCount);
        sc.close();

    }


    public static int countOccurance(List<String> list, String word) {
        int count = 0;
        for (String str : list) {
            if (str.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T t : array) {
            list.add(t);
        }

        return list;
    }

    public static List<Integer> findUnique(List<Integer> listofNumbers) {
        Set<Integer> unique = new HashSet<>(listofNumbers);
        return new ArrayList<>(unique);

    }

    public static void calcOccurance(List<String> list) {

        Map<String, Integer> mapStrings = new HashMap<>();
        for (String str : list) {
            mapStrings.put(str, mapStrings.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : mapStrings.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }

    public static void findOccurance(List<String> list) {
        Map<String, Integer> mapStrings = new HashMap<>();
        for (String str : list) {
            if (mapStrings.containsKey(str)) {
                mapStrings.put(str, mapStrings.get(str) + 1);
            } else
                mapStrings.put(str, 1);
        }

        List<String> listOccurance = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : mapStrings.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            listOccurance.add('\n' + "{name: " + "'" + key + "'," + "occurance: " + value + "}");
        }

        System.out.println(listOccurance);
    }
}

