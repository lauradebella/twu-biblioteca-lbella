package com.twu.output;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lbella on 30/05/17.
 */
public class OutputTest {

    Output output = new Output();

    @Test
    public void shouldReturnWelcomeMessage(){
        assertThat(output.welcomeMessage(), is("***** Hello!! Welcome to Biblioteca *****"));
    }


}