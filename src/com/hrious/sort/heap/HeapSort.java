package com.hrious.sort.heap;

import com.hrious.sort.utils.SortUtils;

/**
 * 堆排序
 * 
 * 1_构建大根堆
 * 2_交换根节点和最后一个节点的值（最后一个节点依次向前递减）
 * 
 * @author wei
 *
 */
public class HeapSort {
	public static void heapSort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			// 1_构建大根堆
			createMaxHeap(data, data.length - 1 -i);
			// 2_交换根节点和最后一个节点的值（最后一个节点依次向前递减）
			SortUtils.swap(data, 0, data.length - 1 -i);
		}
	}

	/**
	 * 构建大根堆
	 * 
	 * 自下而上，由右向左
	 * 
	 * @param data 数据数组
	 * @param i 最后一个节点
	 */
	private static void createMaxHeap(int[] data, int lastIndex) {
		// 自下而上，由左向右
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			// 当前节点拥有子节点
			while (2 * i + 1 <= lastIndex) {
				// 当前节点的孩子节点中最大的节点（默认为左节点）
				int biggerIndex = 2 * i + 1;
				// 如果右节点存在，并且大于左节点
				// 把右节点设定为当前最大节点
				if (biggerIndex < lastIndex && data[biggerIndex] < data[biggerIndex + 1]) {
					biggerIndex++;
				}
				// 比较当前节点和biggerIndex
				// 如果当前节点比子节点中最大的要小，就交换它们俩的值
				// 如果当前节点比子节点中最大的要大，就继续循环
				if (data[i] < data[biggerIndex]) {
					// 交换
					SortUtils.swap(data, i, biggerIndex);
				} else {
					break;
				}
			}
		}
	}
}
