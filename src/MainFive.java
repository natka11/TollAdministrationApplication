import java.util.*;
public class MainFive {

    public static void main(String[] args) {

        Object[][] info = {
                {"Name", "Email", "Phone Number", "Credit Card"},
                {"Anetta Pozer", "apozer0@gizmodo.com", "631-331-4898", "3552421786057285"},
                {"Ilario Overlow", "ioverlow1@sakura.ne.jp", "512-969-3178", "5007666062273933"},
                {"Jenni Bowdery", "jbowdery2@creativecommons.org", "240-981-3226", "3574299080159492"},
                {"Phyllys Karppi", "pkarppi3@cnbc.com", "628-686-9886", "3589734035932315"},
                {"Adelbert Yitzovicz", "ayitzovicz4@jigsy.com", "203-467-0276", "3576321404492926"}

        };


        System.out.println(arrayToListOfLists(info));

    }


    public static List<List<String>> arrayToListOfLists(Object[][] arr) {

        List<List<String>> listOfLists = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                list.add((String)arr[i][j]);}
            listOfLists.add(list);
        } return listOfLists;
    }
}





