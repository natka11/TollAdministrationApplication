import java.util.*;

public class LabTwo {


    public static void main(String[] args) {

        String[] str = {"a", "b", "a", "c", "b"};
        System.out.print(count(str));

        String[] str1 = {"c", "b", "a"};
        System.out.print(count(str1));

        String[] str2 = {"c", "c", "c", "c"};
        System.out.print(count(str2));

    }

    public static Map<String, Integer> count(String[] words) {

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < words.length; i++) {

            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                int value = map.get(words[i]);
                value++;
                map.put(words[i], value);
            }
        }
        return map;
    }
}

