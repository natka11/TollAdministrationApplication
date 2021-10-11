import java.util.*;
public class Lab {

    public static void main(String[] args) {

        String[] str = {"a", "bb", "a", "bb"};
        System.out.print(wordLen(str));

        String[] str1 = {"this", "and", "that", "and"};
        System.out.print(wordLen(str1));

        String[] str2 = {"code", "code", "code", "bug"};
        System.out.print(wordLen(str2));

    }


    public static Map<String, Integer> wordLen(String[] words){

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s:words){
            map.put(s, s.length());
        }

        return map;
    }
}

