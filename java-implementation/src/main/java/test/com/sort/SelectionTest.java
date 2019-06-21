package test.com.sort;

import com.sort.Selection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Selection Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 21, 2019</pre>
 */
public class SelectionTest {

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
        String[] message = {"hello", "world", "select", "sort"};
        selection.sort(message);
        assertTrue(selection.isSorted(message, 0, message.length - 1));
    }
} 
