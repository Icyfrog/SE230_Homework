package wordladder;

import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.*;
import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class GreetingTest {

    private Greeting demo;
    private Stack<String> ss =new Stack<>();
    private StringBuilder ssb = new StringBuilder();

    @Before
    public void setUp() throws Exception {
        demo = new Greeting();
    }

    @Test
    public void getstr() {
        Stack<String> ss =new Stack<>();
        ss.push("date");
        ss.push("cate");
        StringBuilder ssb = new StringBuilder();
        assertEquals("cate -> date",demo.getstr(ss,ssb));
    }

    @Test
    public void rep() {
        String res = demo.rep("qwerty", 2, '1');
        assertEquals("qw1rty", res);
    }
}