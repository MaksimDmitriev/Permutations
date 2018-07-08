package com.app;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void empty() {
        Solution solution = new Solution();
        assertEquals(Collections.EMPTY_SET, solution.permutations(""));
    }

    @Test
    void single() {
        Solution solution = new Solution();
        Set<String> result = new HashSet<>();
        result.add("1");
        assertEquals(result, solution.permutations("1"));
    }

    @Test
    void twoSymbols() {
        Solution solution = new Solution();
        Set<String> result = new HashSet<>();
        result.add("12");
        result.add("21");
        assertEquals(result, solution.permutations("12"));
    }

    @Test
    void threeSymbols() {
        Solution solution = new Solution();
        Set<String> result = new HashSet<>();
        result.add("123");
        result.add("132");
        result.add("213");
        result.add("231");
        result.add("312");
        result.add("321");
        assertEquals(result, solution.permutations("123"));
    }

    @Test
    void fourSymbols() {
        Solution solution = new Solution();
        Set<String> result = new HashSet<>();
        result.add("1234");

        result.add("1243");
        result.add("1324");
        result.add("1342");
        result.add("1423");
        result.add("1432");

        result.add("2134");
        result.add("2143");
        result.add("2314");
        result.add("2341");
        result.add("2413");
        result.add("2431");

        result.add("3124");
        result.add("3142");
        result.add("3214");
        result.add("3241");
        result.add("3412");
        result.add("3421");

        result.add("4123");
        result.add("4132");
        result.add("4213");
        result.add("4231");
        result.add("4312");
        result.add("4321");

        assertEquals(result, solution.permutations("1234"));
    }
}