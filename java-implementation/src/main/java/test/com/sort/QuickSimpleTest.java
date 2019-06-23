package test.com.sort;

import com.sort.Quick;
import com.sort.QuickSimple;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.assertTrue;

/**
 * QuickSimple Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 23, 2019</pre>
 */
public class QuickSimpleTest {

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
        int N = 100;
        QuickSimple quickSimple = new QuickSimple();
        Double[] a = new Double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[j] = Double.valueOf(StdRandom.uniform(10 * N));
            }
            quickSimple.show(a);
            quickSimple.sort(a);
            quickSimple.show(a);
            assertTrue(quickSimple.isSorted(a, 0, a.length - 1));

        }
    }


} 
