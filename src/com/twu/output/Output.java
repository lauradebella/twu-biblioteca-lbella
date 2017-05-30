package com.twu.output;

import java.util.ArrayList;

/**
 * Created by lbella on 30/05/17.
 */
public class Output {

    public String welcomeMessage() {
        return "***** Hello!! Welcome to Biblioteca *****";
    }

    public ArrayList<String> menuOptions(){
        ArrayList<String> options = new ArrayList<String>();
        options.add("1. List all books");

        return options;
    }
}
