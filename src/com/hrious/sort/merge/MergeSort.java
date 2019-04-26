package com.hrious.sort.merge;

/**
 * 
 * �鲢����
 * 
 * @author wei
 *
 */
public class MergeSort {
	public static void mergeSort(int[] data) {
		mergeSort(0, data.length - 1, data);
	}

	private static void mergeSort(int left, int right, int[] data) {
		// ���й鲢������
		if (left < right) {
			// �ҳ�����Ԫ��
			int center = (left + right) / 2;
			// ��������߽�������
			mergeSort(left, center, data);
			// �������ұ߽�������
			mergeSort(center + 1, right, data);
			// �ϲ��ź������������
			merge(left, center, right, data);
		}
	}

	private static void merge(int left, int center, int right, int[] data) {
		int[] tmpArr = new int[data.length]; // ��ʱ����
		int le = left, // ������е���ʼλ��
			ri = center + 1, // �ұ����е���ʼλ��
			ts = left; // ��ʱ���������
		// �Ƚ�������к��ұ����У��ѽ�С��Ԫ�ط�����ʱ������
		while (left <= center && ri <= right) {
			if (data[left] < data[ri]) { // ������е�Ԫ�ؽ�С
				tmpArr[ts++] = data[left++];
			} else { // �ұ�����Ԫ�ؽ�С
				tmpArr[ts++] = data[ri++];
			}
		}
		// ��ʣ�ಿ�ַ�����ʱ������
		// ������������ֻ��һ���������ʱ������
		while (left <= center) {
			tmpArr[ts++] = data[left++];
		}
		while (ri <= right) {
			tmpArr[ts++] = data[ri++];
		}
		// ����ʱ��������ݸ��Ƶ�ԭ����
		while (le <= right) {
			data[le] = tmpArr[le++];
		}
	}

}
