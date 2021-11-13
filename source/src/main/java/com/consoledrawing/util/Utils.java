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

package com.consoledrawing.util;

public class Utils {
    public static int toPositiveInt(String input) throws IllegalArgumentException {
        int i = Integer.parseInt(input);
        if (i <= 0)
            throw new IllegalArgumentException();

        return i;
    }

    public static void shouldAllPositive(int... numbers) {
        for (int num : numbers) {
            if (num < 1) {
                throw new IllegalArgumentException("Number should be > 0");
            }
        }
    }

    public static void shouldAllNonNegative(int... numbers) {
        for (int num : numbers) {
            if (num < 0) {
                throw new IllegalArgumentException("Number should be > 0");
            }
        }
    }
}
