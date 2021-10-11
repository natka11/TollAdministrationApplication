import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;
public class dup<list> {


    public static void main(String[] args) {

        System.out.println(remove("aaafffbccccdde"));


    }

    public static String remove(String str) {

        int i = 0;
        List<Character> list1 = new ArrayList<>();
        while (i < str.length()) {
            char x = str.charAt(i);
            list1.add(x);
            i++;
        }
        String s = "";
        TreeSet<Character> list = new TreeSet<>(list1);
        for (Character l:list) {
           s += l;
        }
        return s;
    }
}

