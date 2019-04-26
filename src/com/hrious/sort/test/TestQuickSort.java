package com.hrious.sort.test;

import org.junit.Test;

import com.hrious.sort.quick.QuickSort;
import com.hrious.sort.utils.SortUtils;

public class TestQuickSort {
	@Test
	public void testQuickSort() {
		int[] data = SortUtils.generate(10, 100);
		SortUtils.print(data);
		QuickSort.quickSort(data);
		SortUtils.print(data);
	}
}
