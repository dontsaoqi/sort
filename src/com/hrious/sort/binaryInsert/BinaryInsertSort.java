package com.hrious.sort.binaryInsert;

/**
 * 
 * 折半插入排序
 * 
 * @author wei
 *
 */
public class BinaryInsertSort {
	public static void binaryInsertSort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			// 当前元素小于有序序列的最后一个元素
			if (data[i] < data[i - 1]) {
				int low = 0, // 搜索的左边界
					heigh = i - 1, // 搜索的右边界
					tmp = data[i]; // 保存i处元素的值
				while (low <= heigh) {
					// 记录中间位置
					int mid = (low + heigh) / 2;
					if (tmp < data[mid]) { // 当前元素小于中间元素
						heigh = mid - 1;
					} else { // 当前元素大于中间元素
						low = mid + 1;
					}
				}
				// 将low--i处的元素整体向后移动一位
				for (int j = i; j > low; j--) {
					data[j] = data[j - 1];
				}
				data[low] = tmp;
			}
		}
	}
}
