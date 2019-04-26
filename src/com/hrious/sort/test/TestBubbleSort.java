package com.hrious.sort.test;

import org.junit.Test;

import com.hrious.sort.bubble.BubbleSort;
import com.hrious.sort.utils.SortUtils;

public class TestBubbleSort {
	@Test
	public void testBubbleSort() {
		int[] data = SortUtils.generate(10, 100);
		SortUtils.print(data);
		BubbleSort.bubbleSort(data);
		SortUtils.print(data);
	}
}
