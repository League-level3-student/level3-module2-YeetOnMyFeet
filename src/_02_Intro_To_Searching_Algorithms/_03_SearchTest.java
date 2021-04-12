package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String [] array = {"hello", "goodbye", "cool"};
        assertEquals(0 , _01_LinearSearch.linearSearch(array, "hello"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int [] array = {1,2,3};
        assertEquals(0, _02_BinarySearch.binarySearch(array, 0, 2, 1));
        //binarySearch(int[] array, int start, int end, int value)
    }
}
