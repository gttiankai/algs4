package test.com.sort; 

import com.sort.HeapAescend;
import com.sort.HeapDescend;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static junit.framework.TestCase.assertTrue;

/** 
* HeapAescend Tester. 
* 
* @author <Authors name> 
* @since <pre>Jun 23, 2019</pre> 
* @version 1.0 
*/ 
public class HeapAescendTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sort(Comparable[] a) 
* 
*/ 
@Test
public void testSort() throws Exception { 
//TODO: Test goes here...

    int N = 10;
    HeapAescend heap = new HeapAescend();

    Double[] nums = new Double[]{67.0, 4.0, 91.0, 26.0, 25.0, 1.0, 61.0, 58.0, 81.0, 6.0};
    heap.sort(nums);
    heap.show(nums);
    assert (heap.isAescend(nums, 0, nums.length - 1));

    Double[] a = new Double[N];
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            a[j] = Double.valueOf(StdRandom.uniform(10 * N));
        }
        heap.show(a);
        heap.sort(a);
        heap.show(a);
        assertTrue(heap.isAescend(a, 0, a.length - 1));
    }
} 

/** 
* 
* Method: sortHeap(Comparable[] heap, int max) 
* 
*/ 
@Test
public void testSortHeap() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: sortSwim(Comparable[] a, int max) 
* 
*/ 
@Test
public void testSortSwim() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = HeapAescend.getClass().getMethod("sortSwim", Comparable[].class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: swim(Comparable[] a, int index) 
* 
*/ 
@Test
public void testSwim() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = HeapAescend.getClass().getMethod("swim", Comparable[].class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: sortSink(Comparable[] a, int max) 
* 
*/ 
@Test
public void testSortSink() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = HeapAescend.getClass().getMethod("sortSink", Comparable[].class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: sink(Comparable[] a, int k, int max) 
* 
*/ 
@Test
public void testSink() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = HeapAescend.getClass().getMethod("sink", Comparable[].class, int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
