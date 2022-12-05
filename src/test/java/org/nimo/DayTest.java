package org.nimo;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

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
    void testDay2() {
        Day2 day = new Day2();
        try {
            day.run();
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }
}