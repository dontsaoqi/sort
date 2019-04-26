package com.hrious.sort.heap;

import com.hrious.sort.utils.SortUtils;

/**
 * ������
 * 
 * 1_���������
 * 2_�������ڵ�����һ���ڵ��ֵ�����һ���ڵ�������ǰ�ݼ���
 * 
 * @author wei
 *
 */
public class HeapSort {
	public static void heapSort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			// 1_���������
			createMaxHeap(data, data.length - 1 -i);
			// 2_�������ڵ�����һ���ڵ��ֵ�����һ���ڵ�������ǰ�ݼ���
			SortUtils.swap(data, 0, data.length - 1 -i);
		}
	}

	/**
	 * ���������
	 * 
	 * ���¶��ϣ���������
	 * 
	 * @param data ��������
	 * @param i ���һ���ڵ�
	 */
	private static void createMaxHeap(int[] data, int lastIndex) {
		// ���¶��ϣ���������
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			// ��ǰ�ڵ�ӵ���ӽڵ�
			while (2 * i + 1 <= lastIndex) {
				// ��ǰ�ڵ�ĺ��ӽڵ������Ľڵ㣨Ĭ��Ϊ��ڵ㣩
				int biggerIndex = 2 * i + 1;
				// ����ҽڵ���ڣ����Ҵ�����ڵ�
				// ���ҽڵ��趨Ϊ��ǰ���ڵ�
				if (biggerIndex < lastIndex && data[biggerIndex] < data[biggerIndex + 1]) {
					biggerIndex++;
				}
				// �Ƚϵ�ǰ�ڵ��biggerIndex
				// �����ǰ�ڵ���ӽڵ�������ҪС���ͽ�����������ֵ
				// �����ǰ�ڵ���ӽڵ�������Ҫ�󣬾ͼ���ѭ��
				if (data[i] < data[biggerIndex]) {
					// ����
					SortUtils.swap(data, i, biggerIndex);
				} else {
					break;
				}
			}
		}
	}
}
