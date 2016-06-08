package org.example.app;

import org.junit.After;

/**
 * Created by massimo on 08/08/16.
 */
public abstract class AbstractTest {

    @After
    public void tearDown() throws Exception {
        System.out.println("Test completed!");
    }
}
