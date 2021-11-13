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

import com.consoledrawing.util.Utils;

public class Point {
    public Point(int _x1, int _y1) {
        Utils.shouldAllNonNegative(_x1, _y1);
        this.x = _x1;
        this.y = _y1;
    }

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public Point setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Point setY(int y) {
        this.y = y;
        return this;
    }
}