package com.leetcode;

/**
 * Given two strings ransomNote and magazine,
 * return true if ransomNote can be constructed by using the letters
 * from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        var charCounters = new int[26]; // amount of low case chars
        var charIndexShift = 97; // 'a' char has 97 index in ASCII
        var missedChars = 0;
        for (int i = 0; i < magazine.length(); i++) {
            // increment counters for available chars
            var mChar = magazine.charAt(i);
            var mCount = charCounters[mChar - charIndexShift];
            charCounters[mChar - charIndexShift] = mCount + 1;
            // decrease amount of missed chars
            if (mCount < 0) missedChars--;
            // continue if target word ends
            if (i >= ransomNote.length()) {
                // if no missed chars - finish iterations
                if (missedChars <= 0) return true;
                continue;
            }
            // decrease amount of available chars
            var rChar = ransomNote.charAt(i);
            var rCount = charCounters[rChar - charIndexShift];
            charCounters[rChar - charIndexShift] = rCount - 1;
            // increase amount of missed chars
            if (rCount < 1) missedChars++;
        }
        return missedChars <= 0;
    }

}
