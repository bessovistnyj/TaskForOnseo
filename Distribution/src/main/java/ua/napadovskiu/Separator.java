package ua.napadovskiu;

import java.util.ArrayList;


public class Separator {

    /**
     * method return sum all elements of Array.
     * @param arrayList
     * @return sum of
     */
    public int sumElements(ArrayList<ManWithWeight> arrayList) {
        int sum = 0;
        for (ManWithWeight element : arrayList) {
            sum += element.getWeight();
        }

        return sum;
    }

    /**
     * method sort all elements and divided.
     * @param list list of people with weight
     * @return list of arrays.
     */
    public ArrayList<ArrayList> divide(ArrayList<ManWithWeight> list) {
        ArrayList<ArrayList> result = new ArrayList<>();

        ManComparator comparator = new ManComparator();

        list.sort(comparator);
        ArrayList<ManWithWeight> array1 = new ArrayList<>();
        ArrayList<ManWithWeight> array2 = new ArrayList<>();

        for (ManWithWeight men: list) {
            if (sumElements(array1) <= sumElements(array2)) {
                array1.add(men);
            } else {
                array2.add(men);
            }
        }
        result.add(array1);
        result.add(array2);
        return result;
    }
}
