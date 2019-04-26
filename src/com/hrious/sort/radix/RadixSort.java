package com.hrious.sort.radix;

import java.util.Arrays;

/**
 * 
 * 基数排序
 * 
 * 多关键字排序
 * 将关键字拆分为子关键字，对子关键字必须借助另一个稳定的排序方法进行排序
 * 
 * 这里使用桶式排序进行子关键字排序
 * 
 * @author wei
 *
 */
public class RadixSort {
	
	/**
	 * 
	 * 基数排序
	 * 
	 * @param radix 关键字的最大值
	 * @param d 关键字位数
	 * @param data 待排数组
	 */
	public static void raidxSort(int radix, int d, int[] data) {
		radix++;
		int[] tmp = new int[data.length], // 保存原数组
			  buckets = new int[radix]; // 记录待排元素的信息
		for (int i = 0, rate = 1; i < d; i++, rate *= radix) {
			// 每次都充值buckets数组
			Arrays.fill(buckets, 0);
			// 将原数组复制到tmp中
			System.arraycopy(data, 0, tmp, 0, tmp.length);
			// 统计子关键字的出现次数
			for (int j = 0; j < data.length; j++) {
				int subKey = (tmp[j] / rate) % radix;
				buckets[subKey]++;
			}
			// 计算子关键字出现的位置
			for (int j = 1; j < radix; j++) {
				buckets[j] = buckets[j] + buckets[j - 1];
			}
			// 将子关键字按照buckets的顺序进行排序
			for (int j = data.length - 1; j >= 0; j--) {
				int subKey = (tmp[j] / rate) % radix;
				data[--buckets[subKey]] = tmp[j];
			}
		}
	}
}
