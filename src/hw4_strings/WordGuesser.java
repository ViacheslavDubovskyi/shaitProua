package hw4_strings;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        String trueWord = words[random.nextInt(words.length)];

        Scanner sc = new Scanner(System.in);
        System.out.println(trueWord);

        StringBuilder guess = new StringBuilder("###############");

        while (true) {
            System.out.println("Enter your guess: ");
            String userWord = sc.nextLine().toLowerCase();

            if (trueWord.equals(userWord)) {
                System.out.println("You guessed the word: " + trueWord + "!");
                break;
            } else {
                for (int i = 0; i < trueWord.length(); i++) {
                    if (userWord.length() > i && userWord.charAt(i) == trueWord.charAt(i)) {
                        guess.setCharAt(i, trueWord.charAt(i));
                    }
                }
                System.out.println("Wrong guess. Try again: " + guess);

//                String guess = "";
//                for (int i = 0; i < trueWord.length(); i++) {
//                    if (userWord.length() > i && userWord.charAt(i) == trueWord.charAt(i)) {
//                        guess += trueWord.charAt(i);
//                    } else guess += "#";
//                }
//                System.out.println("Wrong guess. Try again: " + guess + "###############");
            }
        }
        sc.close();
    }
}

