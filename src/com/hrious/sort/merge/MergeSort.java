package com.hrious.sort.merge;

/**
 * 
 * 归并排序
 * 
 * @author wei
 *
 */
public class MergeSort {
	public static void mergeSort(int[] data) {
		mergeSort(0, data.length - 1, data);
	}

	private static void mergeSort(int left, int right, int[] data) {
		// 进行归并的条件
		if (left < right) {
			// 找出索引元素
			int center = (left + right) / 2;
			// 对索引左边进行排序
			mergeSort(left, center, data);
			// 对索引右边进行排序
			mergeSort(center + 1, right, data);
			// 合并排好序的两个序列
			merge(left, center, right, data);
		}
	}

	private static void merge(int left, int center, int right, int[] data) {
		int[] tmpArr = new int[data.length]; // 临时数组
		int le = left, // 左边序列的起始位置
			ri = center + 1, // 右边序列的起始位置
			ts = left; // 临时数组的索引
		// 比较左边序列和右边序列，把较小的元素放入临时数组中
		while (left <= center && ri <= right) {
			if (data[left] < data[ri]) { // 左边序列的元素较小
				tmpArr[ts++] = data[left++];
			} else { // 右边序列元素较小
				tmpArr[ts++] = data[ri++];
			}
		}
		// 把剩余部分放入临时数组中
		// 左右两个序列只有一个会放入临时数组中
		while (left <= center) {
			tmpArr[ts++] = data[left++];
		}
		while (ri <= right) {
			tmpArr[ts++] = data[ri++];
		}
		// 将临时数组的内容复制到原数组
		while (le <= right) {
			data[le] = tmpArr[le++];
		}
	}

}
