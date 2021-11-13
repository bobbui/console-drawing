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

public class CreateCommand implements Command {

    private static String helpMessage = "C w h           Should create a new canvas of width w and height h. w, h should be > 0";
    private int height;
    private int width;

    public CreateCommand(String... params) {
        if (params.length < 2)
            throw new InvalidCommandParams("Create command expects 2 params", helpMessage);
        try {
            width = Utils.toPositiveInt(params[0]);
            height = Utils.toPositiveInt(params[1]);
        } catch (IllegalArgumentException e) {
            throw new InvalidCommandParams("Number must >= 0", helpMessage);
        }
    }

    public int getHeight() {
        return height;
    }

    public CreateCommand setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public CreateCommand setWidth(int width) {
        this.width = width;
        return this;
    }
}