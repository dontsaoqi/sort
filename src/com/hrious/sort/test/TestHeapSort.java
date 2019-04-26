package com.hrious.sort.test;

import org.junit.Test;

import com.hrious.sort.heap.HeapSort;
import com.hrious.sort.utils.SortUtils;

public class TestHeapSort {
	@Test
	public void testHeapSort() {
		int[] data = SortUtils.generate(10, 100);
		SortUtils.print(data);
		HeapSort.heapSort(data);
		SortUtils.print(data);
	}
}
