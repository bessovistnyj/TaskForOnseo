package ua.napadovskiu;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 *
 */
public class SeparatorTest {

    private MenWithWeight men1 = new MenWithWeight("name1", 85);

    private MenWithWeight men2 = new MenWithWeight("name2", 95);

    private MenWithWeight men3 = new MenWithWeight("name3", 55);

    private MenWithWeight men4 = new MenWithWeight("name4", 75);

    /**
     *
     */
    @Test
    public void WhenAddArrayThenReturnTwoArrays() {
        Separator separator = new Separator();
        ArrayList<MenWithWeight> list = new ArrayList<>();

        list.add(men1);
        list.add(men2);
        list.add(men3);
        list.add(men4);

        ArrayList<ArrayList> result = separator.divide(list);

        assertThat(result.size(), is(2));

    }
}