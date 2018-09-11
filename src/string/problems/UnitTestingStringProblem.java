package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Assert.assertEquals(true, Palindrome.checkPalindrome("DAD"));
        String s="It is forbidden to proceed inside";
        Assert.assertEquals("forbidden", DetermineLargestWord.findTheLargestWord(s));
        Assert.assertEquals(false, Anagram.isAnagram("CAT","ARMY"));
    }
}
