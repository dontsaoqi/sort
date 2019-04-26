package com.hrious.sort.utils;

import java.util.Random;

/**
 * ���򹤾���
 * @author wei
 *
 */
public class SortUtils {
	
	private SortUtils() {}
	
	/**
	 * �����������
	 * @param a �����С
	 * @param b ���Ԫ��
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
	 * ���������±�a��b�����ֵ
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
	 * ��ӡ����
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
