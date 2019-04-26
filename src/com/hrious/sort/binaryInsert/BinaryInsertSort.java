package com.hrious.sort.binaryInsert;

/**
 * 
 * �۰��������
 * 
 * @author wei
 *
 */
public class BinaryInsertSort {
	public static void binaryInsertSort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			// ��ǰԪ��С���������е����һ��Ԫ��
			if (data[i] < data[i - 1]) {
				int low = 0, // ��������߽�
					heigh = i - 1, // �������ұ߽�
					tmp = data[i]; // ����i��Ԫ�ص�ֵ
				while (low <= heigh) {
					// ��¼�м�λ��
					int mid = (low + heigh) / 2;
					if (tmp < data[mid]) { // ��ǰԪ��С���м�Ԫ��
						heigh = mid - 1;
					} else { // ��ǰԪ�ش����м�Ԫ��
						low = mid + 1;
					}
				}
				// ��low--i����Ԫ����������ƶ�һλ
				for (int j = i; j > low; j--) {
					data[j] = data[j - 1];
				}
				data[low] = tmp;
			}
		}
	}
}
