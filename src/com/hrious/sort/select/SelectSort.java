package com.hrious.sort.select;

import com.hrious.sort.utils.SortUtils;

/**
 * ֱ��ѡ������
 * @author wei
 *
 */
public class SelectSort {
	
	public static void selectSort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				// ����
				SortUtils.swap(data, i, minIndex);
			}
		}
	}
}
