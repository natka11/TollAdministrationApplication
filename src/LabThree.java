import java.util.*;

public class LabThree {

    public static void main(String[] args) {

        String[] str = {"a", "b", "a", "c", "b"};
        System.out.print(wordMultiple(str));

        String[] str1 = {"c", "b", "a"};
        System.out.print(wordMultiple(str1));

        String[] str2 = {"c", "c", "c", "c"};
        System.out.print(wordMultiple(str2));

    }

    public static Map<String, Boolean> wordMultiple(String[] words) {

        Map<String, Integer> map = new HashMap<>();
        Map<String, Boolean> map1 = new HashMap<>();


        for (int i = 0; i < words.length; i++) {

            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                int value = map.get(words[i]);
                value++;
                map.put(words[i], value);
            }
            map1.put(words[i], map.get(words[i]) >= 2);
        }
        return map1;

    }
}


