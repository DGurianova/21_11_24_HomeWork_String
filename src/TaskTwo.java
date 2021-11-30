public class TaskTwo {
    //    (*) Дана строка, состоящая только из слов и пробелов, и число N.
//    Вернуть новую строку максимальной длины, состоящую из начала исходной строки,
//    содержащую ТОЛЬКО слова целиком, при этом длины не больше чем N.
//    Пример: (Hello world guys, 8 ) -> Hello.
//            (Hello world guys, 12 ) -> Hello world.
//        (Hello world guys, 16+ ) -> Hello world guys.
    public static void main(String[] args) {
        String string = new String();
        int n;
        System.out.println(getStrings("Hello world guys", 8));
        System.out.println(getStrings("Hello world guys", 12));
        System.out.println(getStrings("Hello world guys", 15));
        System.out.println(getStrings("Hello world guys", 16));
        System.out.println(getStrings("Hello world guys", 20));
        System.out.println(getStrings("Hello world guys", 5));

    }

    static String getStrings(String string, int n) {
        char[] chars = string.toCharArray();
        if (n >= string.length()) {
            return string;
        }
        int index = string.indexOf(" ");
        int lastSpaceIndex = index;
        if (index > 0 && index <= n) {
            while (index < n && index > 0) {
                lastSpaceIndex = index;
                index = string.indexOf(" ", index + 1);

            }
            return string.substring(0, lastSpaceIndex); // happy case по правилам
        }

        if (lastSpaceIndex < 0) {
            if (chars[0] != ' ' && string.length() == n) {
                return string; //возвращает всю строку
            }
        }
        return new String(); // возвращает пустую строку
    }
}

