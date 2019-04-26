package com.hrious.sort.bubble;

import com.hrious.sort.utils.SortUtils;

/**
 * 
 * 冒泡排序
 * 
 * @author wei
 *
 */
public class BubbleSort {
	public static void bubbleSort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			// 记录数组是否发生交换
			boolean flag = false;
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					// 交换
					SortUtils.swap(data, j, j +1);
					flag = true;
				}
			}
			// 没有进行交换，说明数组有序
			if (!flag) {
				break;
			}
		}
	}
}
