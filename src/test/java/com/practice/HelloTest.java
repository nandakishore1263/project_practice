package com.practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testGreet() {
        Hello hello = new Hello();
        assertEquals("Hello Nandakishore!", hello.greet("Nandakishore"));
    }

    @Test
    public void testGreetEmpty() {
        Hello hello = new Hello();
        assertEquals("Hello !", hello.greet(""));
    }
}
