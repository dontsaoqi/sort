package com.hrious.sort.test;

import org.junit.Test;

import com.hrious.sort.select.SelectSort;
import com.hrious.sort.utils.SortUtils;

public class TestSelectSort {
	@Test
	public void testSelectSort() {
		int[] data = SortUtils.generate(10, 100);
		SortUtils.print(data);
		SelectSort.selectSort(data);
		SortUtils.print(data);
	}
}
