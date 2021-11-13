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


import com.consoledrawing.util.Utils;

public class BucketFillCommand implements DrawEntityCommand {
    private static final String helpMessage = "B x y c         Should fill the entire area connected to (x,y) with \"colour\" c. The\n" +
            "                behaviour of this is the same as that of the \"bucket fill\" tool in paint\n" +
            "                programs.";
    private int  x;
    private int  y;
    private char character;

    public BucketFillCommand(String... params) {
        if (params.length < 3)
            throw new InvalidCommandParams("Bucket fill expects 3 params", helpMessage);
        if (params[2].length() != 1)
            throw new InvalidCommandParams("Color character should only be 1 character", helpMessage);
        try {
            x = Utils.toPositiveInt(params[0]);
            y = Utils.toPositiveInt(params[1]);
            character = params[2].charAt(0);
        } catch (IllegalArgumentException e) {
            throw new InvalidCommandParams("x or y should be > 0", helpMessage);
        }
    }

    public int getX() {
        return x;
    }

    public BucketFillCommand setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public BucketFillCommand setY(int y) {
        this.y = y;
        return this;
    }

    public char getCharacter() {
        return character;
    }

    public BucketFillCommand setCharacter(char character) {
        this.character = character;
        return this;
    }
}