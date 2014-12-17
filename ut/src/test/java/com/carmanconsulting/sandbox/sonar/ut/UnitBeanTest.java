package com.carmanconsulting.sandbox.sonar.ut;

import org.junit.Assert;
import org.junit.Test;

public class UnitBeanTest extends Assert {

    @Test
    public void testDoUnitStuf() throws Exception {
        new UnitBean().doUnitStuff();;
    }
}