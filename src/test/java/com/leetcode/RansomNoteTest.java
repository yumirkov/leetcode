package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RansomNoteTest {

    RansomNote solution = new RansomNote();

    /**
     * Input: ransomNote = "a", magazine = "b"
     * Output: false
     */
    @Test
    void example1() {
        // given
        var ransomNote = "a";
        var magazine = "b";
        var expected = false;
        // when
        boolean actual = solution.canConstruct(ransomNote, magazine);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: ransomNote = "aa", magazine = "ab"
     * Output: false
     */
    @Test
    void example2() {
        // given
        var ransomNote = "aa";
        var magazine = "ab";
        var expected = false;
        // when
        boolean actual = solution.canConstruct(ransomNote, magazine);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: ransomNote = "aa", magazine = "aab"
     * Output: true
     */
    @Test
    void example3() {
        // given
        var ransomNote = "aa";
        var magazine = "aab";
        var expected = true;
        // when
        boolean actual = solution.canConstruct(ransomNote, magazine);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: ransomNote = "s", magazine = "aabasdklfalsdjfhlaksdjfaklsdjfkhweois"
     * Output: true
     */
    @Test
    void ownExample1() {
        // given
        var ransomNote = "s";
        var magazine = "aabasdklfalsdjfhlaksdjfaklsdjfkhweois";
        var expected = true;
        // when
        boolean actual = solution.canConstruct(ransomNote, magazine);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: ransomNote = "s", magazine = "aabasdklfalsdjfhlaksdjfaklsdjfkhweois"
     * Output: true
     */
    @Test
    void testExample114() {
        // given
        var ransomNote = "fihjjjjei";
        var magazine = "hjibagacbhadfaefdjaeaebgi";
        var expected = false;
        // when
        boolean actual = solution.canConstruct(ransomNote, magazine);
        // then
        assertEquals(expected, actual);
    }

}