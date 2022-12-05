package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public abstract class AdventOfCode2022 {

    final static String fileTemplate = "input_%s.txt";

    public void run() throws IOException {
        List<String> input = getFileAsStream(getDayNumber());
        // printFileContent(input);

        solvePart1(input);
        solvePart2(input);
    }

    protected abstract int getDayNumber();
    protected abstract void solvePart1(List<String> input);
    protected abstract void solvePart2(List<String> input);

    protected List<String> getFileAsStream(final int day) throws IOException {
        try (InputStreamReader isr = new InputStreamReader(getFileAsIOStream(day));
             BufferedReader reader = new BufferedReader(isr)) {
            return reader.lines().toList();
        }
    }

    protected InputStream getFileAsIOStream(final int day)
    {
        String fileName = String.format(fileTemplate, day);

        InputStream ioStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(fileName);

        if (ioStream == null) {
            throw new IllegalArgumentException(fileName + " is not found");
        }
        return ioStream;
    }
}
