public class TaskThree {
    public static void main(String[] args) {
        //  Написать метод, который принимает строку и паттерн, и возвращает количество вхождений паттерна в строку. Пример: ("Hello world", "l") -> 3
        System.out.println(getNumberOfPattern("Hello world", "l")); //3
        System.out.println(getNumberOfPattern("Hello world", "e"));//1
        System.out.println(getNumberOfPattern("Hello world", "o"));//2
        System.out.println(getNumberOfPattern("Hello world", "lo"));//1
        System.out.println(getNumberOfPattern("Hello world", "or"));//1
        System.out.println(getNumberOfPattern("Hello world", "Hello"));//1
        System.out.println(getNumberOfPattern("Hello world", "hell"));//0
    }

    static int getNumberOfPattern(String string, String pattern) {
//        string = string.toLowerCase();
//        pattern = pattern.toLowerCase();
        int numberOfPattern = 0;
        for (int i = 0; i < string.length(); i++) {
            if (i == string.indexOf(pattern, i)) {
                numberOfPattern++;
            }
        }
        return numberOfPattern;
    }
}


