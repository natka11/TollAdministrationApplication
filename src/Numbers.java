import java.util.*;
public class Numbers {

    public static void main(String[] args) {

        OccurenceOfEachNumber("1 5 9 2 1 5 8 1"); //"1(3) 2(1) 5(2) 8(1) 9(1)"
        System.out.println("");
        OccurenceOfEachNumber("1 1 1 1 1 1 1 1"); // "1(8)"
        System.out.println("");
        OccurenceOfEachNumber("1 1 2 2 5 5 5 1");// "1(3) 2(2) 5(3)"

    }


        public static void OccurenceOfEachNumber(String number){

        String[] numbers = number.split(" ");

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < numbers.length; i++) {

            if (!map.containsKey(numbers[i])) {
                map.put(numbers[i], 1);
            } else {
                int value = map.get(numbers[i]);
                value++;
                map.put(numbers[i], value);
            }
            }
            for (Map.Entry<String,Integer> entry : map.entrySet()){
                System.out.print(entry.getKey() + "(" + entry.getValue() + ")" + " ");
        }
        }
}
