package ua.napadovskiu;

import java.util.Comparator;

/**
 * comparator for sort.
 */
public class ManComparator implements Comparator<ManWithWeight> {

    /**
     *
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(ManWithWeight o1, ManWithWeight o2) {
        if (o1.getWeight() == o2.getWeight()) {
            return 0;
        }
        if (o1.getWeight() < o2.getWeight()) {
            return 1;
        } else {
            return -1;
        }
    }
}
