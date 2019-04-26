package com.hrious.sort.shell;

/**
 * 
 * ϣ������
 * 
 * ��ʽh=3*h+1
 * ������h=(h-1)/3;
 * 
 * @author wei
 *
 */
public class ShellSort {
	public static void shellSort(int[] data) {
		// ���������hֵ
		int h = 1;
		while (h < data.length / 3) {
			h = 3 * h + 1;
		}
		while (h > 0) {
			for (int i = h; i < data.length; i += h) {
				// ��ǰԪ��С��ǰһ��Ԫ��
				if (data[i] < data[i - h]) {
					int tmp = data[i], // ���浱ǰԪ��
						j = i - h; // ��¼ǰһ��Ԫ��
					while (j >= 0 && data[j] > tmp) {
						data[j + h] = data[j];
						j -= h;
					}
					// ����
					data[j + h] = tmp;
				}
			}
			// �������һ��h��ֵ
			h = (h - 1) / 3;
		}
	}
}
