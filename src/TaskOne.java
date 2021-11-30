

public class TaskOne {
    public static void main(String[] args) {
//        ДЗ
//        1.Написать метод, который принимает строку, а возвразает boolean - является ли строка палиндромом (игнорируя регистр).
//        Пример: Алла. "А роза упала на лапу Азора" - не палиндром в рамках указанной задачи.
//        Пробелы не игнорируются. (Использовать метод с урока по развороту строки)

        String string = "Alla";
        System.out.println(isPalindrome(string));
        System.out.println(isPalindrome(string) ? "Palindrome !" : "Not a palindrome");
        String string2 = "A rosa upala na lapu Asora";
        System.out.println(isPalindrome(string2));
        System.out.println(isPalindrome(string2) ? "Palindrome !" : "Not a palindrome");
        String string3 = "Guru";
        System.out.println(isPalindrome(string3));
        System.out.println(isPalindrome(string3) ? "Palindrome !" : "Not a palindrome");
        split();

        System.out.println(isPalindrome2(string));
        System.out.println(isPalindrome2(string) ? "Palindrome !" : "Not a palindrome");

        System.out.println(isPalindrome2(string2));
        System.out.println(isPalindrome2(string2) ? "Palindrome !" : "Not a palindrome");

        System.out.println(isPalindrome2(string3));
        System.out.println(isPalindrome2(string3) ? "Palindrome !" : "Not a palindrome");
        reverse(string);

    }

    static String reverse(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(chars.length - 1 - i);
        }

        return new String(chars);
    }

    static void split() {
        System.out.println("*****************************");

    }

    static boolean isPalindrome(String string) {
        string = string.toLowerCase();
        char[] arrayOfChars = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            arrayOfChars[i] = string.charAt(i);
        }
        for (int i = 0; i < string.length() / 2; i++) {
            if (arrayOfChars[i] != arrayOfChars[arrayOfChars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome2(String string) {
        string = string.toLowerCase();
        String string2 = reverse(string);
        return string.equals(string2);
    }
}

