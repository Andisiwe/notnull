package za.ac.cput.notnull;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class TestNotNull extends TestCase {
    public void testNonNullness() throws Exception{
        NotNull nn = new NotNull();

        Assert.assertNotNull("Andisiwe");
    }
}
