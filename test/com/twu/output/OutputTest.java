package com.twu.output;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lbella on 30/05/17.
 */
public class OutputTest {

    @Test
    public void shouldReturnWelcomeMessage(){
        Output output = new Output();
        assertThat(output.welcomeMessage(), is("***** Hello!! Welcome to Biblioteca *****"));
    }


}