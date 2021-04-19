package _04_JavaClassSearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {

	public static int[] arraySort(int[] arr) {
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i + " ");
		}

		return arr;
	}

	public static List<Double> listSort(List<Double> list) {
		Collections.sort(list);
		for (Double double1 : list) {
			System.out.println(double1 + " ");
		}
		return list;
	}

	public static Boolean arraySearch(char[] arr, char key) {
		int index = -1;
		Arrays.sort(arr);
		 index = Arrays.binarySearch(arr, key);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		if (index <= -1) {
			return false;
		}
		else {
			return true;
		}
		
		}

	public static Boolean listSearch(List<Character> list, Character key) {
		int index = -1;
		Collections.sort(list);
		 index = Collections.binarySearch(list, key);
		for (Character character : list) {
			System.out.println(character + " ");
		}
		if (index <= -1) {
			return false;
		}
		else {
			return true;
		}
	}
}
