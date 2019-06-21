package test.com.sort;

import com.sort.Selection;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Insertion Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 22, 2019</pre>
 */
public class InsertionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: sort(Comparable[] a)
     */
    @Test
    public void testSort() throws Exception {
//TODO: Test goes here...
        Selection selection = new Selection();
        Double [] a = new Double[100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                a[j] = StdRandom.uniform();
            }
            selection.sort(a);
            assertTrue(selection.isSorted(a, 0 , a.length-1));
            //selection.show(a);
        }
    }
} 
