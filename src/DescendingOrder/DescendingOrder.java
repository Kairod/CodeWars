package DescendingOrder;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        int result;
        ArrayList<Integer> numbers = intToListOfNumber(num);
        numbers.sort(Collections.reverseOrder());
        StringBuilder strTemp = new StringBuilder();
        for (Integer number : numbers) {
            strTemp.append(String.valueOf(number));
        }
        String strResult = strTemp.toString();
        result = Integer.parseInt(strResult);
        return result;
    }

    private static ArrayList<Integer> intToListOfNumber(final int num){
        String str = Integer.toString(num);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            numbers.add(Character.getNumericValue(str.charAt(i)));
        }
        return numbers;
    }
}
