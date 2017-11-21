package com.example.alejandro.calcoach;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Quiz q = new Quiz(1);
        int i =  q.getCalification();
        assertEquals(5, i);

    }
}