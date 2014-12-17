package com.carmanconsulting.sandbox.sonar.it;

import org.junit.Assert;
import org.junit.Test;

public class IntegrationBeanIT extends Assert {

    @Test
    public void testDoIntegrationStuff() throws Exception {
        new IntegrationBean().doIntegrationStuff();
    }
}