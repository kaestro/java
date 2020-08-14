package autoboxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Kim");

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            intArrayList.add(Integer.valueOf(i)); // auto boxing
        }

        for (Integer num : intArrayList) {
            System.out.println(num);
        }

        Integer myIntValue = 56; // equal to Integer.valueOf(56);
        int myInt = myIntValue; // equal to myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < myDoubleValues.size(); ++i) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
            value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}
