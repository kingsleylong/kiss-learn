package ch1.sec3;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by kiss on 15/9/9.
 */
public class MaxSubseqSumTest {
    private int[] A;

    @Before
    public void setUp() throws Exception {
        this.A = new int[]{4, -3, 5, -2, -1, 2, 6, -2};
    }

    @Test
    public void testCalMaxSubseqSum2() throws Exception {
        new Thread(new Runnable() {
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(4);
                System.out.println(1);
                System.out.println(-2);
                System.out.println(4);
                System.out.println(-2);
            }
        }).start();

        MaxSubseqSum maxSubseqSum = new MaxSubseqSum();
        System.out.println("START");
        System.out.println(maxSubseqSum.calMaxSubseqSum2());
        System.out.println("END");
    }
}