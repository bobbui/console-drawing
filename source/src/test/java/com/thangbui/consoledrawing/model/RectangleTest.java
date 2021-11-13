/*
 *
 *  * Copyright (c) 2017, Bob T.. All rights reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *
 */

package com.consoledrawing.model;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void create() throws Exception {
        new Rectangle(1, 2, 1, 3);
    }

    @Test
    public void create7() {
        new Rectangle(1, 2, 3, 4);
    }

    @Test
    public void create2() throws Exception {
        Rectangle line1 = new Rectangle(1, 2, 1, 3);
        Rectangle line2 = new Rectangle(1, 2, 1, 3);
        Assert.assertEquals(line1, line2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create3() throws Exception {
        new Rectangle(-1, 2, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create4() throws Exception {
        new Rectangle(1, -2, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create5() throws Exception {
        new Rectangle(1, 2, -1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create6() throws Exception {
        new Rectangle(1, 2, 1, -2);
    }
}