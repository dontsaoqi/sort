package com.hrious.sort.quick;

/**
 * ��������
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
			// ����߽��п���
			quickSort(left, index - 1, data);
			// ���ұ߽��п���
			quickSort(index + 1, right, data);
		}
	}

	private static int partation(int left, int right, int[] data) {
		int x = data[left], // ��
			i = left, // ��ָ��
			j = right; // ��ָ��
		// ע�⣺�տ�ʼ�������
		while (i < j) {
			// �����ƶ���ָ��
			while (data[j] > x && i < j) { j--; }
			// �ұߵ���ȥ����ߵĿ�
			if (i < j) {
				data[i] = data[j];
				i++;
			}
			// �����ƶ���ָ��
			while (data[i] < x && i < j) { i++; }
			// ��ߵ���ȥ���ұߵĿ�
			if (i < j) {
				data[j] = data[i];
				j--;
			}
		}
		// i==j�˳�
		// ��x�������Ŀ���
		data[i] = x;
		return i;
	}
}
