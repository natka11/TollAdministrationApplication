import java.util.*;
public class MapFour {

    public static void main(String[] args) {

        String[] str = {"code", "bug"};
        System.out.println(pairs(str));

        String[] str1 = {"man", "moon", "main"};
        System.out.print(pairs(str1));

        String[] str2 = {"man", "moon", "maij"};
        System.out.println(pairs(str2));

        String[] str3 = {"a", "b"};
        System.out.println(pairs(str3));

        String[] str4 = {"man", "moon", "good", "night"};
        System.out.println(pairs(str4));

    }

    public static Map<String, String> pairs(String[] words) {


        Map<String, String> map = new HashMap<>();

        for (String word : words) {
            map.put("" + word.charAt(0), "" + word.charAt(word.length() - 1));

        } return map;
        }
}

