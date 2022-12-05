package org.nimo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day2 extends AdventOfCode2022 {

    // Map with moves and corresponding score
    // A for Rock, B for Paper, and C for Scissors (opponent)
    // X for Rock, Y for Paper, and Z for Scissors (elf)
    private Map<String, Integer> roundScores = new HashMap<>() {{
        put("AX", 1 + 3);
        put("AY", 2 + 6);
        put("AZ", 3 + 0);
        put("BX", 1 + 0);
        put("BY", 2 + 3);
        put("BZ", 3 + 6);
        put("CX", 1 + 6);
        put("CY", 2 + 0);
        put("CZ", 3 + 3);
    }};

    @Override
    public int getDayNumber() {
        return 2;
    }

    @Override
    final protected void solvePart1(List<String> input) {

        List<Integer> scoreList = new ArrayList<>();

        for (String roundInput : input) {
            scoreList.add(roundScores.get(roundInput.replaceAll(" ", "")));
        }

        Integer sum = scoreList.stream()
                .reduce(0, Integer::sum);

        System.out.println(input);
        System.out.println("Day1.runPart1: " + sum);
    }

    @Override
    public void solvePart2(List<String> input) {
        System.out.println("Day1.runPart2: " + "N/A");
    }

    private int score(String opponentMove, String elfMove) {
        return 0;
    }

    public record Round(String opponentMove, String elfMove) {
    }
}
