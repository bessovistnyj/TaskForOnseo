package ua.napadovskiu;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 *
 */
public class SeparatorTest {

    private final ManWithWeight men1 = new ManWithWeight("name1", 85);

    private final ManWithWeight men2 = new ManWithWeight("name2", 95);

    private final ManWithWeight men3 = new ManWithWeight("name3", 55);

    private final ManWithWeight men4 = new ManWithWeight("name4", 75);

    private  final ArrayList<ManWithWeight> list = new ArrayList<>();

    private final Separator separator = new Separator();


    @Before
    public void fillArray() {
        this.list.add(this.men1);
        this.list.add(this.men2);
        this.list.add(this.men3);
        this.list.add(this.men4);

    }


    @Test
    public void whenDivideArrayWhenFirstArrayReturnSummAllElements() {

        ArrayList<ArrayList> result = this.separator.divide(list);

        ArrayList array1 = result.get(0);
        assertThat(separator.sumElements(array1), is(150));

    }

    @Test
    public void whenDivideArrayWhenSecondtArrayReturnSummAllElements() {

        ArrayList<ArrayList> result = this.separator.divide(list);

        ArrayList array2 = result.get(1);
        assertThat(separator.sumElements(array2), is(160));

    }

}