package com.hrious.sort.utils;

import java.util.Random;

/**
 * 排序工具类
 * @author wei
 *
 */
public class SortUtils {
	
	private SortUtils() {}
	
	/**
	 * 随机产生数组
	 * @param a 数组大小
	 * @param b 最大元素
	 * @return
	 */
	public static int[] generate(int a, int b) {
		Random rand = new Random();
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(b);
		}
		return arr;
	}
	
	/**
	 * 交换数组下标a，b代表的值
	 * @param data
	 * @param a
	 * @param b
	 */
	public static void swap(int[] data, int a, int b) {
		if (a != b) {
			data[a] = data[a] + data[b];
			data[b] = data[a] - data[b];
			data[a] = data[a] - data[b];
		}
	}
	
	/**
	 * 打印数组
	 * @param data
	 */
	public static void print(int[] data) {
		System.out.print(data[0]);
		for (int i = 1; i< data.length; i++) {
			System.out.print(" " + data[i]);
		}
		System.out.println();
	}
}
