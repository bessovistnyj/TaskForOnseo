package ua.napadovskiu;

import java.util.Comparator;

/**
 * comparator for sort.
 */
public class MenComparator  implements Comparator<MenWithWeight> {

    /**
     *
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(MenWithWeight o1, MenWithWeight o2) {
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
