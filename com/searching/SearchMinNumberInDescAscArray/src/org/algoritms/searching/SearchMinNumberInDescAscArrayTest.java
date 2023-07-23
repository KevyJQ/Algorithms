package org.algoritms.searching;

import static org.junit.Assert.assertEquals;
import static org.algoritms.searching.SearchMinNumberInDescAscArray.findMinNumberInDescAscArray;

import org.junit.Test;

public class SearchMinNumberInDescAscArrayTest {

	@Test
	public void test_oneElement() {
		int[] numbers;

		numbers = new int[] { 2 };
		assertEquals(2, findMinNumberInDescAscArray(numbers));
	}

	@Test
	public void test_twoElements() {
		int[] numbers;

		numbers = new int[] { 3, 5 };
		assertEquals(3, findMinNumberInDescAscArray(numbers));

		numbers = new int[] { 6, 1 };
		assertEquals(1, findMinNumberInDescAscArray(numbers));
	}

	@Test
	public void test_threeElements() {
		int[] numbers;

		numbers = new int[] { 5, 1, 3 };
		assertEquals(1, findMinNumberInDescAscArray(numbers));

		numbers = new int[] { 1, 3, 5 };
		assertEquals(1, findMinNumberInDescAscArray(numbers));

		numbers = new int[] { 5, 3, 1 };
		assertEquals(1, findMinNumberInDescAscArray(numbers));
	}

	@Test
	public void test_InfinteElements() {
		int[] numbers;

		numbers = new int[] { 23, 20, 21, 15, 10, 5, 8, 9 };
		assertEquals(5, findMinNumberInDescAscArray(numbers));

		numbers = new int[] { 23, 22, 15, 16, 17, 18, 19, 21 };
		assertEquals(15, findMinNumberInDescAscArray(numbers));

		numbers = new int[] { 1, 2, 3, 4, 5 };
		assertEquals(1, findMinNumberInDescAscArray(numbers));

		numbers = new int[] { 5, 4, 3, 2, 1 };
		assertEquals(1, findMinNumberInDescAscArray(numbers));

		numbers = new int[] { 10, 8, 7, 5, 4, 3, 2, 1, 24, 40 };
		assertEquals(1, findMinNumberInDescAscArray(numbers));

		numbers = new int[] { 10, 9, 1, 2, 3, 4, 5, 6 };
		assertEquals(1, findMinNumberInDescAscArray(numbers));
	}
}
