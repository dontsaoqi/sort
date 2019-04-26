package com.hrious.sort.test;

import org.junit.Test;

import com.hrious.sort.binaryInsert.BinaryInsertSort;
import com.hrious.sort.utils.SortUtils;

public class TestBinaryInsertSort {
	@Test
	public void testBinarySort() {
		int[] data = SortUtils.generate(10, 50);
		SortUtils.print(data);
		BinaryInsertSort.binaryInsertSort(data);
		SortUtils.print(data);
	}
}
