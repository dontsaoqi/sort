package com.hrious.sort.bucket;

/**
 * 
 * Ͱʽ����
 * 
 * ֻ����������
 * ʹ��buckets[i]=buckets[i]+buckets[i-1]������Ԫ��λ��
 * 
 * @author wei
 *
 */
public class BucketSort {
	
	/**
	 * 
	 * Ͱʽ����
	 * 
	 * @param min ������������Сֵ
	 * @param max �������������ֵ
	 * @param data ��������
	 */
	public static void bucketSort(int min, int max, int[] data) {
		// ����ԭ�����Ԫ��
		int[] tmp = new int[data.length];
		System.arraycopy(data, 0, tmp, 0, tmp.length);
		// buckets���飬������¼����Ԫ�ص���Ϣ��ʹ���˹�ϣ��˼�룩
		int[] buckets = new int[max + 1 - min];
		// ͳ��ÿ��Ԫ�س��ֵĴ���
		for (int i = 0; i < data.length; i++) {
			buckets[data[i] - min]++;
		}
		// ���������ʹ�ڵ�Ԫ�����������е�λ��
		for (int i = 1; i < max - min; i++) {
			buckets[i] = buckets[i] + buckets[i - 1];
		}
		// ����buckets�е���Ϣ�����������еĸ�Ԫ�ط�����Ӧλ��
		for (int i = data.length - 1; i >= 0; i--) {
			data[--buckets[tmp[i] - min]] = tmp[i];
		}
	}
}
