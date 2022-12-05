package org.nimo;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

    @Test
    void testDay1() {
        Day1 day = new Day1();
        try {
            day.run();
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void runPart2() {
    }
}