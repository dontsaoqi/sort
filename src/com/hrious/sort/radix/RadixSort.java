package com.hrious.sort.radix;

import java.util.Arrays;

/**
 * 
 * ��������
 * 
 * ��ؼ�������
 * ���ؼ��ֲ��Ϊ�ӹؼ��֣����ӹؼ��ֱ��������һ���ȶ������򷽷���������
 * 
 * ����ʹ��Ͱʽ��������ӹؼ�������
 * 
 * @author wei
 *
 */
public class RadixSort {
	
	/**
	 * 
	 * ��������
	 * 
	 * @param radix �ؼ��ֵ����ֵ
	 * @param d �ؼ���λ��
	 * @param data ��������
	 */
	public static void raidxSort(int radix, int d, int[] data) {
		radix++;
		int[] tmp = new int[data.length], // ����ԭ����
			  buckets = new int[radix]; // ��¼����Ԫ�ص���Ϣ
		for (int i = 0, rate = 1; i < d; i++, rate *= radix) {
			// ÿ�ζ���ֵbuckets����
			Arrays.fill(buckets, 0);
			// ��ԭ���鸴�Ƶ�tmp��
			System.arraycopy(data, 0, tmp, 0, tmp.length);
			// ͳ���ӹؼ��ֵĳ��ִ���
			for (int j = 0; j < data.length; j++) {
				int subKey = (tmp[j] / rate) % radix;
				buckets[subKey]++;
			}
			// �����ӹؼ��ֳ��ֵ�λ��
			for (int j = 1; j < radix; j++) {
				buckets[j] = buckets[j] + buckets[j - 1];
			}
			// ���ӹؼ��ְ���buckets��˳���������
			for (int j = data.length - 1; j >= 0; j--) {
				int subKey = (tmp[j] / rate) % radix;
				data[--buckets[subKey]] = tmp[j];
			}
		}
	}
}
