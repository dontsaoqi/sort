package com.hrious.sort.test;

import org.junit.Test;

import com.hrious.sort.bucket.BucketSort;
import com.hrious.sort.utils.SortUtils;

public class TestBucketSort {
	@Test
	public void testBucketSort() {
		int[] data = { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		SortUtils.print(data);
		BucketSort.bucketSort(1, 9, data);
		SortUtils.print(data);
	}
}
