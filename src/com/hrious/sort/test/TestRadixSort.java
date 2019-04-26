package com.hrious.sort.test;

import org.junit.Test;

import com.hrious.sort.radix.RadixSort;
import com.hrious.sort.utils.SortUtils;

public class TestRadixSort {
	@Test
	public void testRadixSort() {
		int[] data = { 1100, 1235, 999, 12, 9, 2, 46 };
		SortUtils.print(data);
		RadixSort.raidxSort(9, 4, data);
		SortUtils.print(data);
	}
}
