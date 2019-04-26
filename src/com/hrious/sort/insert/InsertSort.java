package com.hrious.sort.insert;

/**
 * 
 * ֱ�Ӳ�������
 * 
 * @author wei
 *
 */
public class InsertSort {
	public static void insertSort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			// ���浱ǰֵ
			int tmp = data[i];
			// ��ǰ����ǰһ����С
			if (data[i] < data[i - 1]) {
				// ��¼��ǰԪ�ص�ǰһ��ָ��
				int j = i - 1;
				// ���������һλ
				while (j >= 0 && data[j] > tmp) {
					data[j + 1] = data[j--];
				}
				// ������Ԫ�ز����ʵ���λ��
				data[j + 1] = tmp;
			}
		}
	}
}
