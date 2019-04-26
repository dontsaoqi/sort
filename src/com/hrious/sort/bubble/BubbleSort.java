package com.hrious.sort.bubble;

import com.hrious.sort.utils.SortUtils;

/**
 * 
 * ð������
 * 
 * @author wei
 *
 */
public class BubbleSort {
	public static void bubbleSort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			// ��¼�����Ƿ�������
			boolean flag = false;
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					// ����
					SortUtils.swap(data, j, j +1);
					flag = true;
				}
			}
			// û�н��н�����˵����������
			if (!flag) {
				break;
			}
		}
	}
}
