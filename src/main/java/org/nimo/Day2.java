package org.nimo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day2 extends AdventOfCode2022 {

    // Map with moves and corresponding score
    // A for Rock, B for Paper, and C for Scissors (opponent)
    // X for Rock, Y for Paper, and Z for Scissors (elf)
    private Map<String, Integer> roundScores = Map.of(
            "AX", 1 + 3,
            "AY", 2 + 6,
            "AZ", 3 + 0,
            "BX", 1 + 0,
            "BY", 2 + 3,
            "BZ", 3 + 6,
            "CX", 1 + 6,
            "CY", 2 + 0,
            "CZ", 3 + 3
    );

    // Map with moves and corresponding move to get expected result
    // A for Rock, B for Paper, and C for Scissors (opponent)
    // X for loose, Y for draw, and Z for win (elf)
    Map<String, String> roundMoves = Map.of(
            "AX", "Z",
            "AY", "X",
            "AZ", "Y",
            "BX", "X",
            "BY", "Y",
            "BZ", "Z",
            "CX", "Y",
            "CY", "Z",
            "CZ", "X"
    );

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
