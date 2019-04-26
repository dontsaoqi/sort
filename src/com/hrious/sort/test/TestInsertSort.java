package com.hrious.sort.test;

import org.junit.Test;

import com.hrious.sort.insert.InsertSort;
import com.hrious.sort.utils.SortUtils;

public class TestInsertSort {
	@Test
	public void testInsertSort() {
		int[] data = SortUtils.generate(10, 50);
		SortUtils.print(data);
		InsertSort.insertSort(data);
		SortUtils.print(data);
	}
}
