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

public class InvalidCommandParams extends RuntimeException {

    private final String help;

    public InvalidCommandParams(String message, String _help) {
        super(message);
        help = _help;
    }

    public String getHelpMessage() {
        return help;
    }
}