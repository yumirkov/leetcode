package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        var result = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            var divisibleBy3 = i % 3 == 0;
            var divisibleBy5 = i % 5 == 0;
            var currentString = "";
            if (divisibleBy3) currentString += "Fizz";
            if (divisibleBy5) currentString += "Buzz";
            if (currentString.isEmpty()) currentString += i;
            result.add(currentString);
        }
        return result;
    }

}
