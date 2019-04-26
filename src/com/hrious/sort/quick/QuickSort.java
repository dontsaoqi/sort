package com.hrious.sort.quick;

/**
 * 快速排序
 * 
 * @author wei
 *
 */
public class QuickSort {
	public static void quickSort(int[] data) {
		quickSort(0, data.length - 1, data);
	}

	private static void quickSort(int left, int right, int[] data) {
		if (left < right) {
			int index = partation(left , right, data);
			// 对左边进行快排
			quickSort(left, index - 1, data);
			// 对右边进行快排
			quickSort(index + 1, right, data);
		}
	}

	private static int partation(int left, int right, int[] data) {
		int x = data[left], // 坑
			i = left, // 左指针
			j = right; // 右指针
		// 注意：刚开始坑在左边
		while (i < j) {
			// 向左移动右指针
			while (data[j] > x && i < j) { j--; }
			// 右边的数去填左边的坑
			if (i < j) {
				data[i] = data[j];
				i++;
			}
			// 向右移动左指针
			while (data[i] < x && i < j) { i++; }
			// 左边的数去填右边的坑
			if (i < j) {
				data[j] = data[i];
				j--;
			}
		}
		// i==j退出
		// 把x填入最后的坑中
		data[i] = x;
		return i;
	}
}
