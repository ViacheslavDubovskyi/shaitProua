package hw4_strings;

import java.util.Scanner;

public class WordPosition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source: ");
        String source = sc.nextLine();

        System.out.println("Enter target: ");
        String target = sc.nextLine();
        int startAt = findWordPosition(source, target);

        System.out.println(startAt);
    }

    public static int findWordPosition(String source, String target) {

        int pos = source.indexOf(target);
//        int pos = -1;
//        if (source.contains(target)) {
//            pos = source.indexOf(target);
//        }
        return pos;
    }
}

