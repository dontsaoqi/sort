package com.hrious.sort.bucket;

/**
 * 
 * 桶式排序
 * 
 * 只能排序整数
 * 使用buckets[i]=buckets[i]+buckets[i-1]，计算元素位置
 * 
 * @author wei
 *
 */
public class BucketSort {
	
	/**
	 * 
	 * 桶式排序
	 * 
	 * @param min 待排数组中最小值
	 * @param max 待排数组中最大值
	 * @param data 待排数组
	 */
	public static void bucketSort(int min, int max, int[] data) {
		// 保存原数组的元素
		int[] tmp = new int[data.length];
		System.arraycopy(data, 0, tmp, 0, tmp.length);
		// buckets数组，用来记录排序元素的信息（使用了哈希的思想）
		int[] buckets = new int[max + 1 - min];
		// 统计每个元素出现的次数
		for (int i = 0; i < data.length; i++) {
			buckets[data[i] - min]++;
		}
		// 计算落入个痛内的元素在有序序列的位置
		for (int i = 1; i < max - min; i++) {
			buckets[i] = buckets[i] + buckets[i - 1];
		}
		// 根据buckets中的信息，将待排序列的各元素放入相应位置
		for (int i = data.length - 1; i >= 0; i--) {
			data[--buckets[tmp[i] - min]] = tmp[i];
		}
	}
}
