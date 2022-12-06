package org.nimo;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Day1 extends AdventOfCode2022 {

    @Override
    public int getDayNumber() {
        return 1;
    }

    @Override
    final protected void solvePart1(List<String> input) {

        int maxCalories = 0;
        int currentElfCalories = 0;
        for (String s : input) {
            if (s.isBlank()) {
                maxCalories = Math.max(maxCalories, currentElfCalories);
                currentElfCalories = 0;
            } else {
                currentElfCalories += Integer.parseInt(s);
            }
        }

        System.out.println("Day1.runPart1: " + maxCalories);
    }

    @Override
    public void solvePart2(List<String> input) {

        Stack<Integer> elfQueue = new Stack<>();

        int currentElfCalories = 0;
        for (String s : input) {
            if (s.isBlank()) {
                elfQueue.push(currentElfCalories);
                currentElfCalories = 0;
            } else {
                currentElfCalories += Integer.parseInt(s);
            }
        }

        int result = 0;
        Collections.sort(elfQueue);
        result += elfQueue.pop();
        result += elfQueue.pop();
        result += elfQueue.pop();

        System.out.println("Day1.runPart2: " + result);
    }
}
