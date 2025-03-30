package hw9_tasks;

public class IsPalindromePhrase {

    public static void main(String[] args) {

        String phrase1 = "A man, a plan, a canal: Panama";
        String phrase2 = "race a car";
        String phrase3 = " ";

        System.out.println(isPalindrome(phrase1));
        System.out.println(isPalindrome(phrase2));
        System.out.println(isPalindrome(phrase3));

    }

    public static boolean isPalindrome(String phrase) {
        phrase = phrase.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        int left = 0;
        int right = phrase.length() - 1;

        while (left < right) {
            if (phrase.charAt(left) != phrase.charAt(right)) {
                System.out.println('"' + phrase + '"' + " not a palindrome");
                return false;
            }
            left++;
            right--;
        }
        System.out.println('"' + phrase + '"' + " is a palindrome");
        return true;
    }
}
