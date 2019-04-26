package com.hrious.sort.test;

import org.junit.Test;

import com.hrious.sort.merge.MergeSort;
import com.hrious.sort.utils.SortUtils;

public class TestMergeSort {
	@Test
	public void testMergeSort() {
		int[] data = SortUtils.generate(10, 50);
		SortUtils.print(data);
		MergeSort.mergeSort(data);
		SortUtils.print(data);
	}
}
