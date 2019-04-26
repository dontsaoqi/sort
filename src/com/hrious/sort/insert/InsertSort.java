package com.hrious.sort.insert;

/**
 * 
 * 直接插入排序
 * 
 * @author wei
 *
 */
public class InsertSort {
	public static void insertSort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			// 保存当前值
			int tmp = data[i];
			// 当前数比前一个数小
			if (data[i] < data[i - 1]) {
				// 记录当前元素的前一个指针
				int j = i - 1;
				// 整体向后；移一位
				while (j >= 0 && data[j] > tmp) {
					data[j + 1] = data[j--];
				}
				// 把最后的元素插入适当的位置
				data[j + 1] = tmp;
			}
		}
	}
}
