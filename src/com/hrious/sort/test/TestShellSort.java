package com.hrious.sort.test;

import org.junit.Test;

import com.hrious.sort.shell.ShellSort;
import com.hrious.sort.utils.SortUtils;

public class TestShellSort {
	@Test
	public void testShellSort() {
		int[] data = SortUtils.generate(10, 50);
		SortUtils.print(data);
		ShellSort.shellSort(data);
		SortUtils.print(data);
	}
}
