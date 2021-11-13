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

public class Line implements Entity {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line(int _x1, int _y1, int _x2, int _y2) {
        if (_x1 != _x2 && _y1 != _y2) {
            throw new IllegalArgumentException("Draw line does not support diagonal line at the moment");
        }
        Utils.shouldAllPositive(_x1, _y1, _x2, _y2);

        if ((x1 == x2 && y1 > y2) || (y1 == y2 && x1 > x2)) {
            this.x1 = _x2;
            this.y1 = _y2;
            this.x2 = _x1;
            this.y2 = _y1;
        } else {
            this.x1 = _x1;
            this.y1 = _y1;
            this.x2 = _x2;
            this.y2 = _y2;
        }
    }

    public int getX1() {
        return x1;
    }

    public Line setX1(int x1) {
        this.x1 = x1;
        return this;
    }

    public int getY1() {
        return y1;
    }

    public Line setY1(int y1) {
        this.y1 = y1;
        return this;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (x1 != line.x1) return false;
        if (y1 != line.y1) return false;
        if (x2 != line.x2) return false;
        return y2 == line.y2;
    }

    @Override
    public int hashCode() {
        int result = x1;
        result = 31 * result + y1;
        result = 31 * result + x2;
        result = 31 * result + y2;
        return result;
    }
}