package com.app;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void empty() {
        Solution solution = new Solution();

        Set<String> result = new HashSet<>();
        solution.permutationFinder("", result);

        assertEquals(Collections.EMPTY_SET, result);
    }

    @Test
    void single() {
        Solution solution = new Solution();
        Set<String> expected = new HashSet<>();
        expected.add("1");

        Set<String> result = new HashSet<>();
        solution.permutationFinder("1", result);

        assertEquals(expected, result);
    }

    @Test
    void twoSymbols() {
        Solution solution = new Solution();
        Set<String> expected = new HashSet<>();
        expected.add("12");
        expected.add("21");

        Set<String> result = new HashSet<>();
        solution.permutationFinder("12", result);

        assertEquals(expected, result);
    }

    @Test
    void threeSymbols() {
        Solution solution = new Solution();
        Set<String> expected = new HashSet<>();
        expected.add("123");
        expected.add("132");
        expected.add("213");
        expected.add("231");
        expected.add("312");
        expected.add("321");

        Set<String> result = new HashSet<>();
        solution.permutationFinder("123", result);

        assertEquals(expected, result);
    }

    @Test
    void fourSymbols() {
        Solution solution = new Solution();
        Set<String> expected = new HashSet<>();
        expected.add("1234");
        expected.add("1243");
        expected.add("1324");
        expected.add("1342");
        expected.add("1423");
        expected.add("1432");

        expected.add("2134");
        expected.add("2143");
        expected.add("2314");
        expected.add("2341");
        expected.add("2413");
        expected.add("2431");

        expected.add("3124");
        expected.add("3142");
        expected.add("3214");
        expected.add("3241");
        expected.add("3412");
        expected.add("3421");

        expected.add("4123");
        expected.add("4132");
        expected.add("4213");
        expected.add("4231");
        expected.add("4312");
        expected.add("4321");

        Set<String> result = new HashSet<>();
        solution.permutationFinder("1234", result);

        assertEquals(expected, result);
    }
}