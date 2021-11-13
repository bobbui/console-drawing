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

package com.consoledrawing.command;

import org.junit.Test;

public class DrawRectangleCommandTest {
    @Test
    public void testCreate() throws Exception {
        new DrawRectangleCommand("1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate1() throws Exception {
        new DrawRectangleCommand("-1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate2() throws Exception {
        new DrawRectangleCommand("1", "-1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate3() throws Exception {
        new DrawRectangleCommand("1", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate4() throws Exception {
        new DrawRectangleCommand("1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate6() throws Exception {
        new DrawRectangleCommand();
    }
}