package com.hrious.sort.shell;

/**
 * 
 * 希尔排序
 * 
 * 公式h=3*h+1
 * 反过来h=(h-1)/3;
 * 
 * @author wei
 *
 */
public class ShellSort {
	public static void shellSort(int[] data) {
		// 计算出最大的h值
		int h = 1;
		while (h < data.length / 3) {
			h = 3 * h + 1;
		}
		while (h > 0) {
			for (int i = h; i < data.length; i += h) {
				// 当前元素小于前一个元素
				if (data[i] < data[i - h]) {
					int tmp = data[i], // 保存当前元素
						j = i - h; // 记录前一个元素
					while (j >= 0 && data[j] > tmp) {
						data[j + h] = data[j];
						j -= h;
					}
					// 填入
					data[j + h] = tmp;
				}
			}
			// 计算出下一个h的值
			h = (h - 1) / 3;
		}
	}
}
