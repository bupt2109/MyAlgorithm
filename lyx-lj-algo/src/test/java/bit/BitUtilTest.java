package bit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * BitUtil Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre> 7, 2019</pre>
 */
public class BitUtilTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: isPowerOf2(int num)
     */
    @Test
    public void testIsPowerOf2() throws Exception {
        Assert.assertEquals(BitUtil.isPowerOf2(2), true);
        Assert.assertEquals(BitUtil.isPowerOf2(2<<1), true);
        Assert.assertEquals(BitUtil.isPowerOf2(2<<2), true);
        Assert.assertEquals(BitUtil.isPowerOf2(2<<3), true);
        Assert.assertEquals(BitUtil.isPowerOf2(2<<4), true);
        Assert.assertEquals(BitUtil.isPowerOf2(2<<5), true);
        Assert.assertEquals(BitUtil.isPowerOf2(2<<6), true);
        Assert.assertEquals(BitUtil.isPowerOf2((2<<6)-1), false);

    }


} 
