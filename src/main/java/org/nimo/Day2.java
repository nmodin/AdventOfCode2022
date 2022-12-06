package org.nimo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day2 extends AdventOfCode2022 {

    // Map with moves and corresponding score
    // A for Rock, B for Paper, and C for Scissors (opponent)
    // X for Rock, Y for Paper, and Z for Scissors (elf)
    private final Map<String, Integer> roundScores = Map.of(
            "AX", 1 + 3,
            "AY", 2 + 6,
            "AZ", 3,
            "BX", 1,
            "BY", 2 + 3,
            "BZ", 3 + 6,
            "CX", 1 + 6,
            "CY", 2,
            "CZ", 3 + 3
    );

    // Map with moves and corresponding move combo to get expected result
    // A for Rock, B for Paper, and C for Scissors (opponent)
    // X for loose, Y for draw, and Z for win (elf)
    private final Map<String, String> roundMoves = Map.of(
            "AX", "AZ",
            "AY", "AX",
            "AZ", "AY",
            "BX", "BX",
            "BY", "BY",
            "BZ", "BZ",
            "CX", "CY",
            "CY", "CZ",
            "CZ", "CX"
    );

    @Override
    public int getDayNumber() {
        return 2;
    }

    @Override
    final protected void solvePart1(List<String> input) {

        Integer sum = calculateScore(input);
        System.out.println("Day1.runPart1: " + sum);
    }

    @Override
    public void solvePart2(List<String> input) {

        List<String> transformedInput = input.stream()
                .map(roundInput -> roundMoves.get(stripSpaces(roundInput)))
                .collect(Collectors.toCollection(() -> new ArrayList<>(input.size())));

        Integer sum = calculateScore(transformedInput);
        System.out.println("Day1.runPart2: " + sum);
    }

    private Integer calculateScore(List<String> input) {
        List<Integer> scoreList = input.stream()
                .map(roundInput -> roundScores.get(stripSpaces(roundInput)))
                .toList();

        return scoreList.stream()
                .reduce(0, Integer::sum);
    }

    private static String stripSpaces(String roundInput) {
        return roundInput.replaceAll(" ", "");
    }
}
