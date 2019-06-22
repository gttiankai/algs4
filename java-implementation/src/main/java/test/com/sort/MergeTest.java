package test.com.sort;

import com.sort.Merge;
import com.sort.Quick;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.assertTrue;

/**
 * Merge Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 23, 2019</pre>
 */
public class MergeTest {

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
        Merge merge = new Merge();
        Double[] a = new Double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[j] = Double.valueOf(StdRandom.uniform(10 * N));
            }
            merge.show(a);
            merge.sort(a);
            merge.show(a);
            assertTrue(merge.isSorted(a, 0, a.length - 1));
        }
//        Double[] a = new Double[]{40.0, 70.0, 26.0, 61.0, 94.0, 41.0, 66.0, 93.0, 35.0, 66.0};
//        merge.sort(a);

    }


} 
