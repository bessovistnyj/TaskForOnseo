package ua.napadovskiu;

import java.util.ArrayList;


public class Separator {

    /**
     *
     * @param arrayList
     * @return
     */
    private int sumElements(ArrayList<MenWithWeight> arrayList) {
        int sum = 0;
        for (MenWithWeight element : arrayList) {
            sum += element.getWeight();
        }

        return sum;
    }

    /**
     *
     * @param list
     * @return
     */
    public ArrayList<ArrayList> divide(ArrayList<MenWithWeight> list) {
        ArrayList<ArrayList> result = new ArrayList<>();

        MenComparator comparator = new MenComparator();

        list.sort(comparator);
        ArrayList<MenWithWeight> array1 = new ArrayList<>();
        ArrayList<MenWithWeight> array2 = new ArrayList<>();

        for (MenWithWeight men: list) {
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
